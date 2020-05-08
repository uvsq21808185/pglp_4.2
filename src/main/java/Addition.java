/*
 * La classe Commande concrète Addition.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 * 
 */
public class Addition implements Commande_calcul {
	
	/* La méthode pour effectuer l'addition de deux nombre
	 * @param1 operande1 nombre
	 * @param2 operande2 deuxi�me nombre
	 * @return le résultat de l'addition de operande1 et operande2
	 */

	public double calculer(double operande1, double operande2) {
		return operande1 + operande2;
	}
}
