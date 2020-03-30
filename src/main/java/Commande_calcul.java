
/* L'interface Commande_calcul du pattern Command pour les op�rations
 * 
 */
public interface Commande_calcul extends Commande {
	
	/* La m�thode abstraite calculer qui sera impl�menter par la suite dans chaque classe d'op�ration
	 * 
	 */
	public double calculer(double operande1, double operande2 ) throws Exception;
	

}
