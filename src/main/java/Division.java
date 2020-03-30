
/*
 * La classe Commande concr�te Division 
 */
public class Division implements Commande_calcul {
	
	/* La m�thode calculer pour effectuer la division de deux nombres
	 * @param1 operande1 num�rateur
	 * @param2 operande2 d�nominateur
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
