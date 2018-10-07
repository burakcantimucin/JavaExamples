package Hesaplama;

public class HesapCalistir {
	public static void main(String[] args) {
		Calc c = new Calc(2); c.Show();
		c.Add(10); c.Show();
		c.Subtract(2.25); c.Show();
		c.Mult(10); c.Show();
		c.Div(2); c.Show();
	}
}
