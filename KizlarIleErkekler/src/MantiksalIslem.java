import java.util.Scanner;

public class MantiksalIslem {
	Scanner bucky = new Scanner(System.in);
	int kizlar = 6, erkekler = 4;
	if (kizlar > erkekler && erkekler < 5) {
		System.out.println("K�zlar�n say�s� erkeklerden fazla ve erkeklerin say�s� 5'ten az.");
	}
	if (kizlar > erkekler || erkekler < 1) {
		System.out.println("K�zlar�n say�s� erkeklerden fazla ya da erkeklerin say�s� 1'den az.");
	}
		
}
