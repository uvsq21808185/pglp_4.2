
/* La classe commande concr�te Soustraction
 * 
 */
public class Soustraction implements Commande_calcul {
	
	/* M�thode calculer pour la soustraction de deux nombres
	 * @param1 operande1 un nombre quelconque
	 * @param2 operande2 le nombre qu'on veut soustraire
	 * @retrun le resultat de soustraction de operande1 et operande2
	 */
	public double calculer(final double operande1,final  double operande2) {
		return operande1 - operande2;
	}

}
