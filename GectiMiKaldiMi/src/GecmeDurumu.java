import java.util.Scanner;

public class GecmeDurumu {
	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		int gecmeNotu = 50;
		System.out.println("��renci Ad� ve Soyad�");
		String Ogrenci = bucky.nextLine();
		System.out.println("��rencinin Ald��� Not");
		int alinanNot = bucky.nextInt();
		if (gecmeNotu <= alinanNot) {
			System.out.println(Ogrenci + " dersi ge�mi�tir.");
		} else {
			System.out.println(Ogrenci + " dersi ge�ememi�tir.");
		}
	}
}
