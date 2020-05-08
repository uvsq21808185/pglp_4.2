import java.util.Scanner;
import java.util.Stack;
/*
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class SaisieRPN {
	
	/**
	 * pile contenant les operandes.
	 */
	private Stack<Double> pile;
	/**
	 * scanner pour les entrées.
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
	/* renvoie la pile
	 * @return une pile
	 */
	public Stack<Double> getPile(){
		return pile;
	}
	/* renvoie l'interepteur
	 * @return un interpreteur.
	 */
	public Interpreteur getInterprete(){
		return interprete;
	}
	/* renvoie le moteur
	 * @return un moteur.
	 */
	public MoteurRPN getMoteur(){
		return moteur;
	}
	/* modifier le moteur
	 * @param m un moteur.
	 */
	public void SetMoteur(MoteurRPN m){
			this.moteur=m;
	}
	/* renvoie le undo
	 * @return u un undo
	 */
	public Undo getU(){
		return u;
	}
	/* renvoie le quit
	 * @return un Quit
	 */
	public Quit getQ(){
		return q;
	}
	/**
	 * Saisir les opérandes et la commande puis effectuer le calcul
	 * @return résultat de calcul
	 * @throws Exception si le résultat est invalide
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
				//récuperer le nombre
				d = s.nextDouble();
				moteur.ajouter_operande(d);

			} catch (java.util.InputMismatchException e) {
				line = s.nextLine();
				try { 
					//récuperer une commande d'opération
					moteur.executer_commande(line);
				} catch (Exception m) {
					try {
						//récuperer la commande interprete
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
		 * si on a pas un seul opérande,
		 * alors on peut pas calculer le résultat
		 */
		if (pile.size() != 1) {
			System.err.println(
			"Il faut saisir un seul nomrbre puis Entrez pour saisir le deuxi�me");
			throw new Exception();
		}
		//retourne le résultat
		System.out.println("resultat du calcul : " + pile);
		return pile.pop();
	}

}
