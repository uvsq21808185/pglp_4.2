import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Addition add = new Addition();
		assertTrue(add.calculer(50.0, 50.0)== 100.0);

		}

}
