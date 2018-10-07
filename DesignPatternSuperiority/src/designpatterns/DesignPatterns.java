package designpatterns;

public class DesignPatterns {
	public static void main(String[] args) {
		Yonetici Ali = new Yonetici("Ali");
		Calisan Veli = new Calisan("Veli");
		Calisan Ahmet = new Calisan("Ahmet");
		Ali.addCalisan(Ahmet);
		Ali.addCalisan(Veli);
		System.out.println("Ahmet'in Y�neticisi: " + Ahmet.Yonetici.Isim);
		System.out.println("Veli'in Y�neticisi: "+ Veli.Yonetici.Isim);
		System.out.println("Ali'nin �al��anlar� 1. " + Ali.Altlari.get(0).Isim + " 2. " + Ali.Altlari.get(1).Isim);
		System.out.println("Ali'nin ka� �al��an� var? "+ Ali.Altlari.size());
	}
}