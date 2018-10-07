package testing;
import static org.junit.Assert.*;
import org.junit.Test;
public class countAtest {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output= test.countA("alphabet");
		// alphabet yazýsýnda 2 tane a olduðu için beklenen sonuç 2 olmalý.
		assertEquals(2,output);
	}
}