
import java.util.Stack;

import org.junit.Test;

public class InterpreteurTest {
	
	@Test
	public void testCommande_undo() throws Exception {
		Stack<Double> p = new Stack<Double>();
		Undo u = new Undo(p);
		Interpreteur i = Interpreteur.initialiser(u, null);
		i.executer_commande("undo");
	}

}
