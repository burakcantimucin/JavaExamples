
public enum Class1 {
	aytekin("nice", "22"),
	haydar("cutie", "10"),
	cebrail("bigmistake", "12");
	
	private final String desc;
	private final String year;
	
	Class1(String description, String birthday) {
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}
