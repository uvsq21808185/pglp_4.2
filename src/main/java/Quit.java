
/* La classe concrète du pattern Command 
 * pour quitter l'application.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class Quit implements Commande_generique {
	
	/* Le constructeur de la classe
	 * 
	 */
	public Quit() {
		
	};
	
	/* implémentation de la méthode executer pour quitter
	 * 
	 */
	public void executer() {
		System.out.println("Vous avez quitt� l'application");
	}

}
