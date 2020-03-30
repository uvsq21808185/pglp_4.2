import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
	public void testAjouter_Operande() {
		Stack<Double> p = new Stack<Double>();
		Undo u = new Undo(p);
		MoteurRPN moteur = MoteurRPN.initialiser(p, u);
		moteur.ajouter_operande(100.0);
		assertTrue(p.pop() == 100.0 && p.isEmpty());
	}

}
