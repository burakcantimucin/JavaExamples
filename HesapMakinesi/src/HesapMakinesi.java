import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String args[]) {
		Scanner bucky = new Scanner(System.in);
		double num1, num2, sonuc;
		System.out.println("�lk Say�");
		num1 = bucky.nextDouble();
		System.out.println("�kinci Say�");
		num2 = bucky.nextDouble();
		sonuc = num1 + num2;
		System.out.println(sonuc);
	}
}
