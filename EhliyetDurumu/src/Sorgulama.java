import java.util.Scanner;

public class Sorgulama {
	public static void main(String args[]) {
		Scanner yas = new Scanner(System.in);
		System.out.println("Yaþýnýzý giriniz");
		System.out.println(yas.nextInt() >= 18 ? "Ehliyet alabilir" : "Ehliyet alamaz");
	}
}
