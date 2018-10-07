
public class DurumBilgisi {
	public static void main(String[] args) {
		int age = 79;
		
		if (age < 50) {
			System.out.println("You are definitely not old");
		}
		else {
			if (age >= 70) {
				System.out.println(age < 80 ? "You are a real senior citizen and really old" : "You will die soon");
			} else if (age >= 60) {
				System.out.println("You are a senior citizen and old");
			} else if (age >= 50) {
				System.out.println("You are in your 50s and will be old soon");
			}
		}
	}
}
