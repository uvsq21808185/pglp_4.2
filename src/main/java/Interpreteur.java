import java.util.HashMap;
import java.util.Map;
/* Classe Interpreteur générique pour les deux commandes quit et undo
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 * 
 */
public class Interpreteur {
	/*
	 * La liste de commandes génériques : quit et undo
	 */
	private Map<String,Commande_generique> commandes ;
	
	/* Le Constructeur */
	
	public Interpreteur() {
		commandes = new HashMap<String,Commande_generique>();
	}
	/*
	 * Méthode pour ajouter des commandes dans la liste.
	 * @param le nom de la commande
	 */
	public void ajouter_commande(String name,Commande_generique commande) {
				this.commandes.put(name, commande);
			}
	/*
	 * Méthode pour exécuter des commandes de la liste.
	 * @param le nom de la commande à exécuter
	 */
	public void executer_commande(String name) throws Exception {
		if (commandes.containsKey(name)) {
			try {
				commandes.get(name).executer();
			} catch (Exception e) {
				System.err.println("La commande saisie a échouée !"
				+ " S'il vous plait veuiller réessayer en exécutant une nouvelle :) ");
			}
		} else {
			System.out.println("La commande à exécuter n'a pas été introduite !");
			throw new Exception();
		}
	}
	/*
	 * @param u undo
	 * @param q quit
	 * @return un interepteur
	 */
	public static Interpreteur initialiser(final Undo u, final Quit q) {
		Interpreteur i = new Interpreteur();
		i.ajouter_commande("undo", u);
		i.ajouter_commande("quit",q);
		return i;
	}
}
