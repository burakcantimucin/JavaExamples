
public class Class2 {
	public static void main(String[] args) {
		Class1 c1_1 = new Class1();
		Class1 c1_2 = new Class1(5);
		Class1 c1_3 = new Class1(5, 13);
		Class1 c1_4 = new Class1(5, 13, 43);
		System.out.printf("%s\n", c1_1.toMilitary());
		System.out.printf("%s\n", c1_2.toMilitary());
		System.out.printf("%s\n", c1_3.toMilitary());
		System.out.printf("%s\n", c1_4.toMilitary());
	}
}
