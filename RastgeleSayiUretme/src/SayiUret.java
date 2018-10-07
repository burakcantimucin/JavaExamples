import java.util.Random;

public class SayiUret {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for (int counter = 1; counter <= 10; counter++) {
			number = dice.nextInt(11);
			System.out.println(number + " ");
		}
	}
}
