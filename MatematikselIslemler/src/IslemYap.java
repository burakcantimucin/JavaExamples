
public class IslemYap {
	public static void main(String[] args) {
		//Matematiksel i�lemleri yapaca��m�z de�i�keni olu�tural�m
		double dSayi = -29.45;
		System.out.println("Say�n�n ilk de�eri: " + dSayi);
		System.out.println("Say�n�n mutlak de�eri: " + Math.abs(dSayi));
		System.out.println("Say�y� yukar�ya yuvarla: " + Math.ceil(dSayi));
		System.out.println("Say�y� a�a��ya yuvarla: " + Math.floor(dSayi));
		System.out.println("81'in karek�k de�eri: " + Math.sqrt(81));
		System.out.println("3'�n k�p�n�n de�eri: " + Math.pow(3, 3));
	}
}
