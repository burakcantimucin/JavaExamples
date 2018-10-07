import java.util.*;

//Runnable interface contains run() method
// Video y�kle ve izle gibi.
// Thread i�in Runnable implements edilmeli.
public class Diger implements Runnable{
	String name;
	int time;
	Random r = new Random();

	public Diger(String x){
		name = x;
		time = r.nextInt(999); //between 0-1 second
	}

	//this runs when you start thread
	public void run(){
		try{
			System.out.printf("%s . numaral� threet, %d sanise uyuduktan sonra �al��t�\n", name, time);
			Thread.sleep(time); //Thread'in ne kadar uyumas�n� istersin?
			System.out.printf("%s thread i�ini tamamlad�\n", name);
		}catch(Exception e){}
	}
}