/*
 * La Classe commande concr�te Multiplication
 */
public class Multiplication implements Commande_calcul {
	/*
	 * La m�thode calculer pour effectuer la multiplication de deux op�randes
	 * @param1 operande1 nombre quelconque
	 * @param2 operande2 nombre
	 * @return le r�sultat de la multiplication de operande1 par operande2
	 */
	
	public double calculer(double operande1, double operande2) {
		return operande1 * operande2;
	}

}
