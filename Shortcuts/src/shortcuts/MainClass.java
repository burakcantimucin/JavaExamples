package shortcuts;

public class MainClass {

	public static void main(String[] args) {
		newmethod();
	}

	private static void newmethod() {
		String name = "Burakcan";
		String address = "Kadýköy/Ýstanbul";
		Examples e = new Examples(name, address);
		System.out.println(e.toString());
		Examples e1 = new Examples(name, address);
		System.out.println(e1.toString());
		Examples e2 = new Examples(name, address);
		System.out.println(e2.toString());
		System.out.println(Examples.countObjects());
	}

}
