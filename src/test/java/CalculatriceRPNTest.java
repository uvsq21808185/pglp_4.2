
import java.io.ByteArrayInputStream;

import org.junit.Test;

public class CalculatriceRPNTest {

	@Test
	public void testOK() throws Exception {
		
		/* La pile : 5,4,2,+,*,quit
		 * 4+2 = 6 puis 6*5 = 30 puis quit
		 * le r�sultat finale normalement c'est 30
		 */
		
		String test = "5\n4\n2\n+\n*\nquit\n";
		System.setIn(new ByteArrayInputStream(test.getBytes()));
	}

}
