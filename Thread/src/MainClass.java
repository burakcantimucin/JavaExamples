
public class MainClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Diger("bir"));
		Thread t2 = new Thread(new Diger("iki"));
		Thread t3 = new Thread(new Diger("üç"));
		Thread t4 = new Thread(new Diger("dört"));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
