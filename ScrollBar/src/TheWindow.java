import java.awt.*; 
import javax.swing.*;
import javax.swing.event.*;


public class TheWindow extends JFrame{
	private JSlider slider;
	private DrawOval myPanel;

	public TheWindow(){
		super("ScrollBar Uygulamasý");
		myPanel = new DrawOval();
		myPanel.setBackground(Color.ORANGE);
		//Slider horizon olsun 0 ile 200 arasýnda sayýlar alsýn.
		slider = new JSlider(SwingConstants.HORIZONTAL,0,265,10);
		//Aralýk belirleme her 10 pixelde bir
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		//Ne zaman slider deðiþtirildiðinde
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setD(slider.getValue()); //Hangi deðer geldi ise o deðeri slidera gönder.
					}
				}

				);
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}