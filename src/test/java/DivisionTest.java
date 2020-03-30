import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() throws Exception {
		Division d = new Division();
		assertTrue(d.calculer(4.0, 2.00)== 2.00);

		}

}
