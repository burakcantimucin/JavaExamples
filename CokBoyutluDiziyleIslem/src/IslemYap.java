
public class IslemYap {
	public static void main(String[] args) {
		int firstArray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
		int secondArray[][] = {{30, 31, 32, 33}, {43}, {44, 45, 46}};
		System.out.println("This is the first array");
		display(firstArray);
		System.out.println("This is the second array");
		display(secondArray);
	}
	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
