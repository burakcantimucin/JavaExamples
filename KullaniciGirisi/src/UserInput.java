import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner k_Adi = new Scanner(System.in);
		System.out.println("Kullan�c� Ad�: " + k_Adi.nextLine());
		Scanner k_Sifre = new Scanner(System.in);
		System.out.println("�ifre: " + k_Sifre.nextLine());
	}
}
