
public enum  CalculatriceRPN {
	
	CALCULATRICE;
	/**
	 * La fonction main de mon programme CalculatriceRPN :
	 * instanciation de la classe SaisieRPN  puis saisir morceau par morceau 
	 * les �l�ments qu'on a besoin pour effectuer le calcul comme les op�randes
	 * et les op�rations qu'on veut appliquer, on peut � tout moment tapez undo
	 * pour revenir en arri�re � l'�tat pr�c�dent ou bien quit pour quitter l'application
	 * une fois on a fini le calcul et afficher le r�sultat. 
	 * @param args arguments pour le d�marrage de l'application.
	 * @throws Exception erreur d'ex�cution du resultat.
	 */
    public static void main(final String[] args) throws Exception {
 
		
        SaisieRPN saisie = new SaisieRPN();
        saisie.calculer();
    }
}


	