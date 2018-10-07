import javax.swing.JOptionPane;

public class Class1 {
	public static void main(String[] args) {
		System.out.println("Hello Eclipse");
		String fn = JOptionPane.showInputDialog("Ýlk Sayýyý Gir:");
		String sn = JOptionPane.showInputDialog("Ýkinci Sayýyý Gir:");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Toplam: " + sum, "Sonuç", JOptionPane.PLAIN_MESSAGE);
	}
}
