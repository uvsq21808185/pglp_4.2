import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* La classe Invoker du pattern Command.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 * 
 */
public class MoteurRPN {

	/**
	 * la pile qui contient les opérandes.
	 */
	 private Stack<Double> pile;
	 
	 /** La liste des commandes de calculs.
	 */
		
	 private Map<String, Commande_calcul> commandes;
	/**
	 * pour revenir en arrière.
	 */
		
	 private Undo undo;
	/**
	 * constructeur de la classe.
	 * @param pile_operandes la pile à empiler
	 * @param undo  le undo à utiliser pour le retour en arrière
	 */
	 private MoteurRPN(final Stack<Double> pile_operandes, final Undo undo) {
		pile = pile_operandes;
		commandes = new HashMap<String, Commande_calcul>();
		this.undo = undo;
	}
	
	/**
	 * exécute la commande associé à la clé nom.
	 * @param name la clé de la commande à exécuter
	 * @return false si la commande n'a pu etre exécuter et vrai sinon
	 * @throws Exception si la commande n'existe pas
	 */
	public boolean executer_commande(final String name) throws Exception {
		if (commandes.containsKey(name)) {
			if (pile.size() < 2) {
				System.err.println("nombre d'opérandes "
						+ "dans l'expression invalide");
				return false;
			}
			double operande2 = pile.pop();
			double operande1 = pile.pop();
			try {
				pile.push(commandes.get(name)
				.calculer(operande1, operande2));
				undo.enregistrer();
				return true;
			} catch (Exception e) {
				pile.push(operande1);
				pile.push(operande2);
				return false;
			}
		} else {
			throw new Exception();
		}
	}
	/**
	 * ajoute un opérande à la pile
	 * @param o opérande à ajouter
	 */
	public void ajouter_operande(final double o) {
		pile.push(o);
		undo.enregistrer();
	}
	/**
	 * ajouter une commande.
	 * @param nom la clé de la commande
	 * @param commande la commande à ins�rer
	 */
	public void ajouter_commande(final String nom,
			final Commande_calcul commande) {
		this.commandes.put(nom, commande);
	}
	/**
	 * initialise un moteur.
	 * @param pile la pile qui sera manipul�
	 * @param u le Undo qui sera utilisé pour le retour en arrière
	 * @return un moteur construit
	 */
	public static MoteurRPN initialiser(final Stack<Double> pile, final Undo u) {
		MoteurRPN m = new MoteurRPN(pile, u);
		m.ajouter_commande("+", new Addition());
		m.ajouter_commande("-", new Soustraction());
		m.ajouter_commande("*", new Multiplication());
		m.ajouter_commande("/", new Division());
		return m;
	}
	
}
