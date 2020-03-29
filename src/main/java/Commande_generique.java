
/* L'interface Commande générique pour les deux commandes Undo et Quit
 * 
 */
public interface Commande_generique {
	
	/* Méthode abstraite qui sera implémenter dans les classes Quit et Undo
	 * 
	 */
	public void executer();

}
