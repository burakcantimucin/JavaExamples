import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Server extends JFrame{

	private JTextField userText;
	private JTextArea chatWindow;
	// 2 bilgisayar aras�ndaki ak��in olmas� i�in kullan�lacakt�r.
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;

	//constructor
	public Server()
	{
		super("Mesajlasma Program�");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
				);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300,150);
		setVisible(true);
	}

	//set up and run the server
	public void startRunning(){
		try{
			server = new ServerSocket(6789, 100); //port number and ka� ki�inin ba�lanaca�� 100 ki�i 
			while(true){
				try{
					//connect and have conversation
					waitForConnection(); //start up
					setupStreams(); // ba�lant� sonras� veri ak���na ba�la
					whileChatting(); // yaz��ma k�sm�
				}catch(EOFException eofException){ //serverda yada ba�lant�da sorun var.
					showMessage("\n Ana Sunucu Ba�lant�y� Sonland�rd�! ");
				}finally{
					closeCrap(); //clean house staff
				}
			}
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	// Ba�lant� bilgilerinin gelmesi i�in bekle
	private void waitForConnection() throws IOException{
		showMessage("Ba�lant� i�in bir kullan�c�n daha sisteme girmesi gerekiyor..\n");
		connection = server.accept(); //herhangi bir pc ba�land���nda ve server ba�lant�y� kabul etti�inde.
		showMessage(" Now connected to " + connection.getInetAddress().getHostName()); 
	}
	// get stream to send and receive data
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Veri Ak��� Ba�layabilir! \n");
	}
	//  During the chat conversation
	private void whileChatting() throws IOException{
		String message = "Ba�land�";
		sendMessage(message);
		ableToType(true);
		do{
			//have a conversation
			try{
				message = (String) input.readObject();
				showMessage("\n" + message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\n Al�nan veri okunamad�");
			}
		}while(!message.equals("Di�er kullan�c� ba�lant�dan koptu")); //KULLANAN ki�i END dedi�inde konu�ma biter.
	}
	// konu�ma sonland�r�ld���n�nda ba�lant�y� ve soketi kapat.
	private void closeCrap(){
		showMessage("\n Ba�lant� sonlan�yor..\n");
		ableToType(false);
		try{
			output.close(); // veri ��k���n� kapat
			input.close(); // veri giri�ini kapat. 
			connection.close(); //socket'i kapat.
		}catch(IOException ioException){
			ioException.printStackTrace();
		}

	}
	// send a message to client
	private  void sendMessage(String message){
		try{
			output.writeObject("SERVER - " + message);
			output.flush();
			showMessage("\n SERVER - "+ message);
		}catch(IOException ioException){
			chatWindow.append("\n Hata-Veri g�nderilemiyor");
		}
	}
	// updates chatWindow
	private void showMessage(final String text){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						chatWindow.append(text);
					}
				}
				);
	}
	// let the user type stuff into their box
	private void ableToType (final boolean tof){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						userText.setEditable(tof);
					}
				}
				);

	}

}