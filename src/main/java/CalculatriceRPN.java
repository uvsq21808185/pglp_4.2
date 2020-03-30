import java.util.Stack;

public enum  CalculatriceRPN {
	
	CALCULATRICE;
	/**
	 * La fonction main de mon programme CalculatriceRPN
	 * instanciation de la classe SaisieRPN
	 * puis saisir morceau par morceau les éléments qu'on a besoin pour effectuer le calcul
	 * comme les opérandes et les opérations qu'on veut appliquer
	 * et puis finalement afficher le résultat du calcul
	 * @param args arguments pour le démarrage de l'application
	 * @throws Exception erreur d'exécution du resultat
	 */
    public static void main(final String[] args) throws Exception {
 
		
        SaisieRPN saisie = new SaisieRPN();
        saisie.calculer();
    }
}


	