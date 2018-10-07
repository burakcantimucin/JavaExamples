import java.util.*;

//Runnable interface contains run() method
// Video yükle ve izle gibi.
// Thread için Runnable implements edilmeli.
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
			System.out.printf("%s . numaralý threet, %d sanise uyuduktan sonra çalýþtý\n", name, time);
			Thread.sleep(time); //Thread'in ne kadar uyumasýný istersin?
			System.out.printf("%s thread iþini tamamladý\n", name);
		}catch(Exception e){}
	}
}