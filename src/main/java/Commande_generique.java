
/* L'interface Commande générique pour les deux commandes Undo et Quit
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 * 
 */
public interface Commande_generique {
	
	/* Méthode abstraite qui sera implémenter dans les classes Quit et Undo.
	 * 
	 */
	public void executer();

}
