import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class diger extends JFrame{
	private JTextField addressBar;
	private JEditorPane display;

	//constructor
	public diger(){
		super("Tarayýcý Baþlýðý");

		addressBar = new JTextField("URL adresi girin!");
		addressBar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						loadCrap(event.getActionCommand());

					}
				}
				);
		add(addressBar,BorderLayout.NORTH); //ekranýn sað ust koþesinde

		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
				new HyperlinkListener(){
					public void hyperlinkUpdate(HyperlinkEvent event){
						// kullanýcý ekrana týkladýðýnda...
						if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
							loadCrap(event.getURL().toString());
						}
					}
				}
				);
		add(new JScrollPane(display),BorderLayout.CENTER);
		//JScrollPane'i JFrame'e ekle.
		setSize(500,300);
		setVisible(true);
	}
	private void loadCrap(String userText){
		try{
			// çalýþtýrma kýsmý
			display.setPage(userText);
			addressBar.setText(userText);
		}catch(Exception e){
			System.out.println("Çalýþmadý!Lütfen geçerli bir adres girin. Örnek http://www.javayaz.com ");
		}
	}

}