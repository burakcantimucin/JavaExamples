
public class TestClass {
	public static void main(String[] args) {
		int x = 5, y = 3;
		System.out.println(Integer.toString(x) + Integer.toString(y));
		int z = Integer.parseInt("9");
		double w = Double.parseDouble("5");
		int a = Integer.parseInt("1101", 8);
		System.out.printf("%d %f %d", z, w, a);
		double b = -100.475; float c = -90;
		System.out.println("\n" + Math.floor(b) + " " + Math.floor(c));
		int d = -8; double e = -100; float f = -90;
		System.out.println(Math.abs(d) + " " + Math.abs(e) + " " + Math.abs(f));
		double g = -100.675; float h = -90;
		System.out.println(Math.ceil(g) + " " + Math.ceil(h));
		double i = 100.675, j = 100.400; float k = 100, l = 90f;
		System.out.println(Math.round(i) + " " + Math.round(j) + " " + Math.round(k) + " " + Math.round(l));
		System.out.println(Math.min(12.123, 12.456) + " " + Math.min(23.12, 23.0));
		System.out.println(Math.max(12.123, 12.456) + " " + Math.max(23.12, 23.0));
		double m = 2;
		System.out.println("e: " + Math.E + " e^2: " + Math.exp(m));
		double n = 2, o = 3;
		System.out.println(Math.pow(n, o));
		double p = 2;
		System.out.println(Math.sqrt(p));
		double q = Math.toRadians(45.0);
		System.out.println("Sinüs: "    + Math.sin(q) + " Cosinüs: "   + Math.cos(q) +
						   " Tanjant: " + Math.tan(q) + " Cotanjant: " + (1/Math.tan(q)));
		double r = Math.random();
		System.out.println(r);
	}
}
