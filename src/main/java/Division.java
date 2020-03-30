
/*
 * La classe Commande concrète Division 
 */
public class Division implements Commande_calcul {
	
	/* La méthode calculer pour effectuer la division de deux nombres
	 * @param1 operande1 numérateur
	 * @param2 operande2 dénominateur
	 * @retrun la division de operande1 par operande2
	 */
	public double calculer( double operande1, double operande2) throws Exception {
		
		if (operande2 == 0) {
			System.err.println("On ne peut pas diviser par 0");
			throw new Exception();
		}
		return operande1 / operande2;
	}

}
