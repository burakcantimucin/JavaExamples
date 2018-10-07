
public class Class2 {
	private String name;
	private Class1 birthday;
	
	public Class2(String theName, Class1 theDate) {
		name = theName;
		birthday = theDate;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
