import java.util.Scanner;

public class GecmeDurumu {
	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		int gecmeNotu = 50;
		System.out.println("Öðrenci Adý ve Soyadý");
		String Ogrenci = bucky.nextLine();
		System.out.println("Öðrencinin Aldýðý Not");
		int alinanNot = bucky.nextInt();
		if (gecmeNotu <= alinanNot) {
			System.out.println(Ogrenci + " dersi geçmiþtir.");
		} else {
			System.out.println(Ogrenci + " dersi geçememiþtir.");
		}
	}
}
