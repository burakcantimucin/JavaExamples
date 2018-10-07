
public class Class2 {
	public static void main(String[] args) {
		for (Class1 people: Class1.values()) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
	}
}
