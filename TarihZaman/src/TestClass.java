import java.util.Date;
import java.util.*;
import java.text.*;

public class TestClass {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		Date d1 = new Date();
		SimpleDateFormat ft1 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		ft1.format(d1);
		Date d2 = new Date();
		SimpleDateFormat ft2 = new SimpleDateFormat("2012.11.dd hh:mm:ss");
		ft2.format(d2);
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.equals(d2));
		Date dNow = new Date();
		SimpleDateFormat ftNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		System.out.println("Current Date: " + ftNow.format(dNow));
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String input = args.length == 0 ? "1811-11-11" : args[0];
		System.out.print(input + " Parses as ");
		Date t;
		try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
		}
		try {
			Date start = new Date();
			System.out.println(start.toString() + "\n");
			Thread.sleep(3000);
			Date stop = new Date();
			System.out.println(stop.toString() + "\n");
		} catch (Exception e) {
			System.out.println("Got an exception");
		}
		try {
			long start = System.currentTimeMillis();
			Date startDate = new Date();
			System.out.println(startDate.toString() + "\n");
			Thread.sleep(3000);
			long end = System.currentTimeMillis();
			Date stopDate = new Date();
			System.out.println(stopDate.toString() + "\n");
			long diff = end - start;
			System.out.println("Difference is: " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception");
		}
	}
}
