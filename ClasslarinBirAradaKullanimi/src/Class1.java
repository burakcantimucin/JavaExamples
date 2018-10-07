
public class Class1 {
	public void SimpleMessage() {
		System.out.println("This is another class");
	}
	public void NameMessage(String name) {
		System.out.println("Hello " + name);
	}
	private String teacherName;
	public void setNameOfTeacher(String name) {
		teacherName = name;
	}
	public String getNameOfTeacher() {
		return teacherName;
	}
	public void sayingOfTeacherName() {
		System.out.printf("Your first teacher was %s", getNameOfTeacher());
	}
}
