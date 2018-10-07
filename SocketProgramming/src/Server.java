import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Server extends JFrame{

	private JTextField userText;
	private JTextArea chatWindow;
	// 2 bilgisayar arasýndaki akýþin olmasý için kullanýlacaktýr.
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;

	//constructor
	public Server()
	{
		super("Mesajlasma Programý");
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
			server = new ServerSocket(6789, 100); //port number and kaç kiþinin baðlanacaðý 100 kiþi 
			while(true){
				try{
					//connect and have conversation
					waitForConnection(); //start up
					setupStreams(); // baðlantý sonrasý veri akýþýna baþla
					whileChatting(); // yazýþma kýsmý
				}catch(EOFException eofException){ //serverda yada baðlantýda sorun var.
					showMessage("\n Ana Sunucu Baðlantýyý Sonlandýrdý! ");
				}finally{
					closeCrap(); //clean house staff
				}
			}
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	// Baðlantý bilgilerinin gelmesi için bekle
	private void waitForConnection() throws IOException{
		showMessage("Baðlantý için bir kullanýcýn daha sisteme girmesi gerekiyor..\n");
		connection = server.accept(); //herhangi bir pc baðlandýðýnda ve server baðlantýyý kabul ettiðinde.
		showMessage(" Now connected to " + connection.getInetAddress().getHostName()); 
	}
	// get stream to send and receive data
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Veri Akýþý Baþlayabilir! \n");
	}
	//  During the chat conversation
	private void whileChatting() throws IOException{
		String message = "Baðlandý";
		sendMessage(message);
		ableToType(true);
		do{
			//have a conversation
			try{
				message = (String) input.readObject();
				showMessage("\n" + message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\n Alýnan veri okunamadý");
			}
		}while(!message.equals("Diðer kullanýcý baðlantýdan koptu")); //KULLANAN kiþi END dediðinde konuþma biter.
	}
	// konuþma sonlandýrýldýðýnýnda baðlantýyý ve soketi kapat.
	private void closeCrap(){
		showMessage("\n Baðlantý sonlanýyor..\n");
		ableToType(false);
		try{
			output.close(); // veri çýkýþýný kapat
			input.close(); // veri giriþini kapat. 
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
			chatWindow.append("\n Hata-Veri gönderilemiyor");
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