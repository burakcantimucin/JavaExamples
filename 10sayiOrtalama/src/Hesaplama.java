import java.util.Scanner;

public class Hesaplama {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		double grade;
		double average;
		int counter = 0;
		
		while (counter < 10) {
			grade = input.nextInt();
			total += grade;
			counter++;
		}
		
		average = total/10;
		System.out.println("Your average is " + average);
	}
}
