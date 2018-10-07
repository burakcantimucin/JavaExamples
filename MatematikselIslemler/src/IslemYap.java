
public class IslemYap {
	public static void main(String[] args) {
		//Matematiksel iþlemleri yapacaðýmýz deðiþkeni oluþturalým
		double dSayi = -29.45;
		System.out.println("Sayýnýn ilk deðeri: " + dSayi);
		System.out.println("Sayýnýn mutlak deðeri: " + Math.abs(dSayi));
		System.out.println("Sayýyý yukarýya yuvarla: " + Math.ceil(dSayi));
		System.out.println("Sayýyý aþaðýya yuvarla: " + Math.floor(dSayi));
		System.out.println("81'in karekök deðeri: " + Math.sqrt(81));
		System.out.println("3'ün küpünün deðeri: " + Math.pow(3, 3));
	}
}
