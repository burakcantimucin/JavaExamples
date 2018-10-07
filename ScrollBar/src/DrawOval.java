import java.awt.*; 
import javax.swing.*;

public class DrawOval extends JPanel{

	private int d=10;

	public void paint(Graphics g){
		super.paint(g); //Super class olan JPanel
		g.fillOval(10,10,d,d);		 
	} 
	public void setD(int newD){
		d = (newD >= 0 ? newD : 10);
		repaint();
	}
	public Dimension getProferredSize(){
		return new Dimension(200,200);
	}
	public Dimension getMinimumSize(){
		return getMinimumSize();
	}

}