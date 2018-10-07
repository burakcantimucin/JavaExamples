
public class IslemYap {
	public static void main(String[] args) {
		int dizi[] = {21, 16, 86, 21, 3};
		int toplam = 0;
		for (int counter = 0; counter < dizi.length; counter++) {
			toplam += dizi[counter];
		}
		System.out.println("The sum of these numbers is " + toplam);
	}
}
