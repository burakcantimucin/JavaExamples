package debug;

public class FractionTester {

	public static void main(String[] args) {
		Fraction ilk = new Fraction(1, 5);
		Fraction son = new Fraction("3/5");
		Fraction[] myFractions = new Fraction[5];

		System.out.println("ilk = " + ilk + " ve son = " + son);

		// Add the fractions, store the result

		Fraction toplam = ilk.add(son);

		myFractions[0] = ilk;
		myFractions[1] = son;
		myFractions[3] = toplam;

		// Print the result
		System.out.println(myFractions[3]);
	}
}