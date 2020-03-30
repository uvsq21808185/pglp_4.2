import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class UndoTest {

	@Test
	public void testUndo() {
		Stack<Double> p = new Stack<Double>();
		Undo u = new Undo(p);
		p.push(10.0); u.enregistrer();
		p.pop(); u.enregistrer();
		p.push(6.0);
		u.enregistrer();
		u.executer();
		assertTrue(p.isEmpty());
	}
}
