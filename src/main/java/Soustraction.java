

/* La classe commande concrète Soustraction
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class Soustraction implements Commande_calcul {
	
	/* Méthode calculer pour la soustraction de deux nombres
	 * @param1 operande1 un nombre quelconque
	 * @param2 operande2 le nombre qu'on veut soustraire
	 * @retrun le resultat de soustraction de operande1 et operande2
	 */
	public double calculer(final double operande1,final  double operande2) {
		return operande1 - operande2;
	}

}
