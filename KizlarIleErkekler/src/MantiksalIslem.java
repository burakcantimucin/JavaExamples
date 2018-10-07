import java.util.Scanner;

public class MantiksalIslem {
	Scanner bucky = new Scanner(System.in);
	int kizlar = 6, erkekler = 4;
	if (kizlar > erkekler && erkekler < 5) {
		System.out.println("Kızların sayısı erkeklerden fazla ve erkeklerin sayısı 5'ten az.");
	}
	if (kizlar > erkekler || erkekler < 1) {
		System.out.println("Kızların sayısı erkeklerden fazla ya da erkeklerin sayısı 1'den az.");
	}
		
}
