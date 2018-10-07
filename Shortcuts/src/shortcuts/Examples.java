package shortcuts;

public class Examples {
	static int counter = 0;
	private String name;
	private String address;
	public Examples(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		countObjects();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Examples [name=" + name + ", address=" + address + "]";
	}
	
	public static int countObjects() {
		return counter++;
	}
}
