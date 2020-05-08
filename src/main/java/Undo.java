import java.util.Stack;
/* Classe Undo
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class Undo implements Commande_generique {

	/**
	 * pile de chaque état de la pile .
	 */
	private Stack<Stack<Double>> etat;
	/**
	 * pile contenant les opérandes.
	 */
	private Stack<Double> pile;
	/**
	 * constructeur de la classe.
	 * @param p  la pile qui contient les opérandes
	 */
	public Undo(final Stack<Double> p) {
		pile = p;
		etat = new Stack<Stack<Double>>();
	}
	/**
	 * effectue un retour en arrière.
	 * Exception  si la pile d'état est vide.
	 */
	public void executer() {
		while (!pile.isEmpty()) {
			pile.pop();
		}
		//si la pile est vide une exception est declench�
		etat.pop();
		copier_dernier_etat();
		}
	/**
	 * enregistre l'état courant de la pile.
	 */
	public void enregistrer() {
		@SuppressWarnings("unchecked")
		Stack<Double> res = (Stack<Double>) pile.clone();
		etat.push(res);
	}
	/**
	 * copier le contenu du dernier état de la pile.
	 */
	private void copier_dernier_etat() {
		for (double d : etat.lastElement()) {
			pile.push(d);
		}
	}
	
}
