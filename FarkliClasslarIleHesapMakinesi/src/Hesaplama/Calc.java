package Hesaplama;

public class Calc {
	private double number;
	
	public Calc(double n) {
		number = n;
	}
	
	public void Add(double n) {
		number += n;
	}
	
	public void Subtract(double n) {
		number -= n;
	}
	
	public void Mult(double n) {
		number *= n;
	}
	
	public void Div(double n) {
		number /= n;
	}
	
	public void Show() {
		System.out.println("Result is " + number);
	}
}
