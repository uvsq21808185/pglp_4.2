import java.util.Scanner;
import java.util.Stack;

public class SaisieRPN {
	
	/**
	 * pile contenant les operandes.
	 */
	private Stack<Double> pile;
	/**
	 * scanner pour les entr�es.
	 */
	private Scanner s;
	/**
	 * moteur de la saisie.
	 */
	private MoteurRPN moteur;
	/**
	 * interpreteur de la saisie pour quit et undo.
	 */
	private Interpreteur interprete;
	
	private Undo u;
	
	private Quit q;
	
	/**
	 * constructeur de la classe SaisieRPN.
	 */
	public SaisieRPN() {
		pile = new Stack<Double>();
		Undo u = new Undo(pile);
		Quit q = new Quit();
		u.enregistrer();
		moteur = MoteurRPN.initialiser(pile, u);
		interprete = Interpreteur.initialiser(u,q);
	}
	
	public Stack<Double> getPile(){
		return pile;
	}
	public Interpreteur getInterprete(){
		return interprete;
	}
	public MoteurRPN getMoteur(){
		return moteur;
	}
	
		public void SetMoteur(MoteurRPN m){
			this.moteur=m;
	}
	public Undo getU(){
		return u;
	}
	public Quit getQ(){
		return q;
	}
	
	
	/**
	 * Saisir les op�randes et la commande puis effectuer le calcul
	 * @return  r�sultat du calcul
	 * @throws Exception si le r�sultat est invalide
	 */
	public double calculer() throws Exception {
		s = new Scanner(System.in);
		double d;
		boolean continuer = true;
		String line = "";
		
		System.out.print("********* CalculatriceRPN ********* \n");

				System.out.print("\n Commandes autoris�es : \n"
		+ "- un nombre entier ou r�el\n"
		+ "- une op�ration parmis {+,-,*,/}\n"
		+ "- \"undo\" pour revenir en arri�re \n"
		+ "- \"quit\" pour quitter l'applicaion :) \n \n ");
		
		System.out.print("---------- \n ");
		System.out.print(" Let's Goooo ! \n");
		System.out.print("---------- \n ");


		while (continuer) {
			
			
			try { 
				//r�cup�rer un nombre
				d = s.nextDouble();
				moteur.ajouter_operande(d);

			} catch (java.util.InputMismatchException e) {
				line = s.nextLine();
				try { 
					//r�cup�rer une commande d'op�ration
					moteur.executer_commande(line);
				} catch (Exception m) {
					try {
						//r�cup�rer commande interprete
						interprete.executer_commande(line);
						
					} catch (Exception i) {
						System.err.println(
						"Commande non autoris�e/"
						+ "reconnue");
					}
				}
			}
			if (line.equalsIgnoreCase("quit")) {
				continuer = false;
			} else {
				System.out.print(
				"\n Pile : " + pile + "\n>");
				//affichage de l'expression
			}
		}
		s.close();
		/*
		 * si on a pas un seul op�rande,
		 * alors on peut pas calculer le r�sultat
		 */
		if (pile.size() != 1) {
			System.err.println(
			"Il faut saisir un seul nomrbre puis Entrez pour saisir le deuxi�me");
			throw new Exception();
		}
		//retourne le r�sultat
		System.out.println("resultat du calcul : " + pile);
		return pile.pop();
	}

}
