package testing;
import static org.junit.Assert.*;
import org.junit.Test;
public class countAtest {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output= test.countA("alphabet");
		// alphabet yaz�s�nda 2 tane a oldu�u i�in beklenen sonu� 2 olmal�.
		assertEquals(2,output);
	}
}