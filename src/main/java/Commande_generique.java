
/* L'interface Commande g�n�rique pour les deux commandes Undo et Quit
 * 
 */
public interface Commande_generique {
	
	/* M�thode abstraite qui sera impl�menter dans les classes Quit et Undo
	 * 
	 */
	public void executer();

}
