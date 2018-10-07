import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner k_Adi = new Scanner(System.in);
		System.out.println("Kullanýcý Adý: " + k_Adi.nextLine());
		Scanner k_Sifre = new Scanner(System.in);
		System.out.println("Þifre: " + k_Sifre.nextLine());
	}
}
