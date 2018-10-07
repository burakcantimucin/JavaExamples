package designpatterns;

import java.util.ArrayList;

public class Yonetici extends Calisan {
	ArrayList <Calisan> Altlari = new ArrayList<Calisan>();
	public Yonetici(String Isim){
		super(Isim);
	}
	public void addCalisan(Calisan alt){
		Altlari.add(alt);
		alt.Yonetici = this;
	}
}