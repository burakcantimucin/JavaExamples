import java.awt.*; 
import javax.swing.*;
import javax.swing.event.*;


public class TheWindow extends JFrame{
	private JSlider slider;
	private DrawOval myPanel;

	public TheWindow(){
		super("ScrollBar Uygulamas�");
		myPanel = new DrawOval();
		myPanel.setBackground(Color.ORANGE);
		//Slider horizon olsun 0 ile 200 aras�nda say�lar als�n.
		slider = new JSlider(SwingConstants.HORIZONTAL,0,265,10);
		//Aral�k belirleme her 10 pixelde bir
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		//Ne zaman slider de�i�tirildi�inde
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setD(slider.getValue()); //Hangi de�er geldi ise o de�eri slidera g�nder.
					}
				}

				);
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}