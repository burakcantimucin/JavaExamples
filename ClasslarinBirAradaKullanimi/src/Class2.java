import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		Class1 c1_1 = new Class1();
		c1_1.SimpleMessage();
		
		Scanner input1 = new Scanner(System.in);
		Class1 c1_2 = new Class1();
		
		System.out.println("Enter your name here");
		String name1 = input1.nextLine();
		
		c1_2.NameMessage(name1);
		
		Scanner input2 = new Scanner(System.in);
		Class1 c1_3 = new Class1();
		
		System.out.println("Enter your first teacher name here");
		String name2 = input2.nextLine();
		
		c1_3.setNameOfTeacher(name2);
		c1_3.sayingOfTeacherName();
	}

}
