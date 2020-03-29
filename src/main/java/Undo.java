import java.util.Stack;

public class Undo implements Commande_generique {

	/**
	 * pile de chaque �tat de la pile .
	 */
	private Stack<Stack<Double>> etat;
	/**
	 * pile contenant les op�randes.
	 */
	private Stack<Double> pile;
	/**
	 * constructeur de la classe.
	 * @param p  la pile qui contient les op�randes
	 */
	public Undo(final Stack<Double> p) {
		pile = p;
		etat = new Stack<Stack<Double>>();
	}
	/**
	 * effectue un retour en arri�re.
	 * Exception  si la pile d'�tat est vide.
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
	 * enregistre l'�tat courant de la pile.
	 */
	public void enregistrer() {
		Stack<Double> res = (Stack<Double>) pile.clone();
		etat.push(res);
	}
	/**
	 * copier le contenu du dernier �tat de la pile.
	 */
	private void copier_dernier_etat() {
		for (double d : etat.lastElement()) {
			pile.push(d);
		}
	}
	
}
