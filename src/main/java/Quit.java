
/* La classe concr�te du pattern Command 
 * pour quitter l'application
 */
public class Quit implements Commande_generique {
	
	/* Le constructeur de la classe
	 * 
	 */
	public Quit() {
		
	};
	
	/* impl�mentation de la m�thode executer pour quitter
	 * 
	 */
	public void executer() {
		System.out.println("Vous avez quitt� l'application");
	}

}
