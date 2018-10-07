import java.awt.*; 
import javax.swing.*;

public class ana_class {
	public static void main(String[] args){

		TheWindow w = new TheWindow();
		// Programý kapatmak için gerekli...
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(300,350);
		w.setVisible(true);
	}
}	