
public class Division implements Commande_calcul {
	
	public double calculer( double operande1, double operande2) throws Exception {
		
		if (operande2 == 0) {
			System.err.println("On ne peut pas diviser par 0");
			throw new Exception();
		}
		return operande1 / operande2;
	}

}
