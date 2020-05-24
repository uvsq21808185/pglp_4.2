# pglp_4.2

![Test Image 4](https://is5-ssl.mzstatic.com/image/thumb/Purple1/v4/df/32/e3/df32e363-c826-8560-ed7b-d2ee1aca028f/source/512x512bb.jpg)


Développement d'une CalculatriceRPN en java en utilisant le design pattern COMMAND vu en cours.


## Description:

Dans cet exercice, on souhaite réaliser une calculatrice fonctionnant en mode RPN (Reverse Polish Notation).
 Cette notation post-fixée permet de représenter des formules arithmétiques sans parenthèses. Par exemple, l’expression « 2 × (3 + 4) » pourra s’écrire « 234 + × ».
 Cette calculatrice devra supporter les opérations de base (+, -, *, /) sur des nombres entiers.
L’interface utilisateur utilisera un interpréteur en mode texte. L’utilisateur saisira au clavier soit un nombre,
 soit une opération, soit undo pour annuler la saisie précédente, soit exit pour sortir. Chaque saisie se terminera par entrée.
 L’implémentation pourra utiliser une pile de la façon suivante : — les opérandes sont empilées lors de leur saisie, — les opérations sont effectuées immédiatement en considérant les opérandes
 se trouvant au sommet de la pile, — le résultat d’une opération est empilé. Après chaque saisie, l’interpréteur affichera le contenu de la pile.
 Pour la conception, vous pourrez consulter Example calculator design.

## Exécution de l'application:

-Classe main : CalculatriceRPN

-Exemple: l’expression « 2 × (3 + 4) » s’écrira « 234 + × »

-Chaque saisie se terminer par la touche entrée

-"undo" pour annuler la saisie précédente

-"exit" pour sortir(quitter).

