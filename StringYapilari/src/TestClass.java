import java.util.Locale;

public class TestClass {
	public static void main(String[] args) {
		//String oluþturma
		String greeting = "Hello World!";
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
		String helloString = new String(helloArray);
		System.out.println(greeting + ", " + helloString);
		//String uzunluðu
		String palindrome = "Don't saw I was tod";
		int len1 = palindrome.length();
		System.out.println("String length is " + len1);
		//String birleþtirme
		System.out.println(palindrome.concat(", " + greeting));
		String str1 = "My name is ".concat("Burakcan");
		System.out.println(str1);
		String str2 = "saw I was ";
		System.out.println("Don't " + str2 + "Tod");
		//String metotlarý
		String s = "Strings are immutable";
		char result = s.charAt(8);
		System.out.println(result);
		String s1 = "Strings are immutable";
		String s2 = "Strings are immutable";
		String s3 = "Integers are not immutable";
		int result2 = s1.compareTo(s2);
		System.out.println(result2);
		result2 = s2.compareTo(s3);
		System.out.println(result2);
		result2 = s3.compareTo(s1);
		System.out.println(result2);
		String st1 = "Maltepe", st2 = "maltepe";
		result2 = st1.compareTo(st2);
		System.out.println(result2);
		result2 = st1.compareToIgnoreCase(st2);
		System.out.println(result2);
		s = s.concat(" all the time");
		System.out.println(s);
		boolean retVal;
		String str = new String("This is immutable");
		retVal = str.endsWith("immutable");
		System.out.println(retVal);
		retVal = str.endsWith("immu");
		System.out.println(retVal);
		String Str1 = new String("maltepe");
		String Str2 = Str1;
		String Str3 = new String("MaLtEpE");
		retVal = Str1.equals(Str2);
		System.out.println(retVal);
		retVal = Str1.equals(Str3);
		System.out.println(retVal);
		String Str4 = new String("Maltepe");
		retVal = Str1.equalsIgnoreCase(Str4);
		System.out.println(retVal);
		System.out.println("String Length: " + Str4.length());
		String Str5 = new String("	Maltepe UnIversIty	");
		System.out.println("Returned Value: " + Str5.replace('e','i'));
		System.out.println("With toUpperCase: " + Str5.toUpperCase());
		System.out.println("With toUpperCase(English type) : " + Str5.toUpperCase(new Locale("en")));
		System.out.println("With toLowerCase: " + Str5.toLowerCase());
		System.out.println("With toLowerCase(English type): " + Str5.toLowerCase(new Locale("en")));
		System.out.println("Trim: " + Str5.trim());
		String Str6 = new String("Welcome to Tutorials about Java");
		String SubStr1 = new String("Tutorials");
		String SubStr2 = new String("Sutorials");
		System.out.print("Found Index: ");
		System.out.println(Str6.indexOf('o'));
		System.out.print("Found Index: ");
		System.out.println(Str6.indexOf('o', 5));
		System.out.print("Found Index: ");
		System.out.println(Str6.indexOf(SubStr1));
		System.out.print("Found Index: ");
		System.out.println(Str6.indexOf(SubStr1, 15));
		System.out.print("Found Index: ");
		System.out.println(Str6.indexOf(SubStr2));
		System.out.println("");
		System.out.println("Return Value: ");
		String splitStr = new String("Jim-Jack-Harry-David");
		for (String tempSplit : splitStr.split("-", 2)) {
			System.out.println(tempSplit);
		}
		System.out.println("");
		System.out.println("Return Value: ");
		for (String tempSplit : splitStr.split("-", 3)) {
			System.out.println(tempSplit);
		}
		System.out.println("");
		System.out.println("Return Value: ");
		for (String tempSplit : splitStr.split("-", 4)) {
			System.out.println(tempSplit);
		}
		String str7 = new String("Strings are immutable");
		System.out.println("Return Value: " + str7.startsWith("String", 0));
		System.out.println("Return Value: " + str7.startsWith("immutable"));
		System.out.println("Return Value: " + str7.startsWith("immutable", 12));
		System.out.println("Return Value: " + str7.subSequence(0, 11));
		System.out.println("Return Value: " + str7.subSequence(11, 18));
	}
}
