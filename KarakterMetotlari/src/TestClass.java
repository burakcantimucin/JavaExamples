import java.lang.Character;

public class TestClass {
	public static void main(String args[]) {
		Character a = new Character('a');
		Character b = new Character('B');
		Character c = new Character('1');
		Character d = new Character('\t');
		System.out.println(a + " " + b + " " + c + " " + d);
		System.out.println(Character.isDigit(a)		+ " " + Character.isLetter(a) 	 + " " + Character.isWhitespace(a) + " " +
						   Character.isUpperCase(a) + " " + Character.isLowerCase(a) + " " + Character.toUpperCase(a)  + " " +
						   Character.toLowerCase(a) + " " + Character.toString(a));
		System.out.println(Character.isDigit(b)		+ " " + Character.isLetter(b) 	 + " " + Character.isWhitespace(b) + " " +
				   	       Character.isUpperCase(b) + " " + Character.isLowerCase(b) + " " + Character.toUpperCase(b)  + " " +
				   	       Character.toLowerCase(b) + " " + Character.toString(b));
		System.out.println(Character.isDigit(c)		+ " " + Character.isLetter(c) 	 + " " + Character.isWhitespace(c) + " " +
		   	       		   Character.isUpperCase(c) + " " + Character.isLowerCase(c) + " " + Character.toUpperCase(c)  + " " +
		   	       		   Character.toLowerCase(c) + " " + Character.toString(c));
		System.out.println(Character.isDigit(d)		+ " " + Character.isLetter(d) 	 + " " + Character.isWhitespace(d) + " " +
		   	       	 	   Character.isUpperCase(d) + " " + Character.isLowerCase(d) + " " + Character.toUpperCase(d)  + " " +
		   	       	 	   Character.toLowerCase(d) + " " + Character.toString(d));
	}
}
