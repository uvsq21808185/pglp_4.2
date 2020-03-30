import java.util.HashMap;
import java.util.Map;
/* Classe Interpreteur g�n�rique pour les deux commandes quit et undo
 * 
 */
public class Interpreteur {
	/*
	 * La liste de commandes g�n�riques : quit et undo
	 */
	private Map<String,Commande_generique> commandes ;
	
	/* Le Constructeur */
	
	public Interpreteur() {
		commandes = new HashMap<String,Commande_generique>();
	}
	/*
	 * M�thode pour ajouter des commandes dans la liste
	 * @param le nom de la commande
	 */
	public void ajouter_commande(String name,Commande_generique commande) {
				this.commandes.put(name, commande);
			}
	/*
	 * M�thode pour ex�cuter des commandes de la liste
	 * @param le nom de la commande � ex�cuter
	 */
	public void executer_commande(String name) throws Exception {
		if (commandes.containsKey(name)) {
			try {
				commandes.get(name).executer();
			} catch (Exception e) {
				System.err.println("La commande saisie a �chou�e !"
				+ " S'il vous plait veuiller r�essayer en ex�cutant une nouvelle :) ");
			}
		} else {
			System.out.println("La commande � ex�cuter n'a pas �t� introduite !");
			throw new Exception();
		}
	}
	public static Interpreteur initialiser(final Undo u, final Quit q) {
		Interpreteur i = new Interpreteur();
		i.ajouter_commande("undo", u);
		i.ajouter_commande("quit",q);
		return i;
	}
}
