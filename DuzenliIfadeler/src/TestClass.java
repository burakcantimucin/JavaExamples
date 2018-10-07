import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {
	public static void main(String[] args) {
		String line = " Benim mailim maltepe@maltepe.edu.tr Bu ise arkadaşımın maili aa@aa.com şeklindedir.";
		String pattern = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		while (m.find()) {
			System.out.println("Found: " + m.group());
		}
		Matcher m1 = r.matcher(line);
		m1.find();
		System.out.println("Found 0: " + m1.group(0));
	}
}
