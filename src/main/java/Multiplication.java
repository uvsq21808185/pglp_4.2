/*
 * La Classe commande concrète Multiplication
 */
public class Multiplication implements Commande_calcul {
	/*
	 * La méthode calculer pour effectuer la multiplication de deux opérandes
	 * @param1 operande1 nombre quelconque
	 * @param2 operande2 nombre
	 * @return le résultat de la multiplication de operande1 par operande2
	 */
	
	public double calculer(double operande1, double operande2) {
		return operande1 * operande2;
	}

}
