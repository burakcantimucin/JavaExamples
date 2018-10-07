
public class Class1 {
	private int sum;
	private final int NUMBER;
	
	public Class1(int x) {
		NUMBER = x;
	}
	
	public void add() {
		sum += NUMBER;
	}
	
	public String toString() {
		return String.format("Sum = %d\n", sum);
	}
}
