
public class VeriyiIsle {
	public static void main(String[] args) {
		System.out.println(average(43, 56, 76, 8));
	}
	public static double average(double...numbers) {
		double total = 0;
		for (double x : numbers) {
			total += x;
		}
		return total/numbers.length;
	}
}
