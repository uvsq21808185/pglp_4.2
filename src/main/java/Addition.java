/*
 * La classe Commande concr�te Addition
 * 
 */
public class Addition implements Commande_calcul {
	
	/* La m�thode pour effectuer l'addition de deux nombre
	 * @param1 operande1 nombre
	 * @param2 operande2 deuxi�me nombre
	 * @return le r�sultat de l'addition de operande1 et operande2
	 */

	public double calculer(double operande1, double operande2) {
		return operande1 + operande2;
	}
}
