
/* L'interface Commande_calcul du pattern Command pour les opérations
 * 
 */
public interface Commande_calcul extends Commande {
	
	/* La méthode abstraite calculer qui sera implémenter par la suite dans chaque classe d'opération
	 * 
	 */
	public double calculer(double operande1, double operande2 ) throws Exception;
	

}
