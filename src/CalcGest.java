package src;

import src.operations.*;

/**
 * Gère les opérations de la calculatrice.
 */
public class CalcGest {
    /**
     * Effectue l'opération choisie en fonction de l'entrée de l'utilisateur.
     *
     * @param choix Le type d'opération à effectuer.
     * @param num1  Le premier nombre.
     * @param num2  Le deuxième nombre.
     * @return Le résultat de l'opération choisie.
     */
    public int effectuerOperation(int choix, int num1, int num2) {
        switch (choix) {
            case 1:
                return new Addition(num1, num2).calculer();
            case 2:
                return new Soustraction(num1, num2).calculer();
            case 3:
                return new Multiplication(num1, num2).calculer();
            case 4:
                return new Division(num1, num2).calculer();
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                return 0;
        }
    }
}
