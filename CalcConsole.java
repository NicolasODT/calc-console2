import java.util.Scanner;

import src.operations.Addition;
import src.operations.Division;
import src.operations.Multiplication;
import src.operations.Soustraction;

public class CalcConsole {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Choisissez une opération: \n" +
                    "[1] Addition\n" +
                    "[2] Soustraction\n" +
                    "[3] Multiplication\n" +
                    "[4] Division\n" +
                    "[5] Quitter\n" +
                    "Entrez votre choix : ");

            // Vérification si l'entrée est un nombre entier
            while (!scan.hasNextInt()) {
                System.out.println("Ce n'est pas un nombre. Veuillez entrer un nombre.");
                scan.next();
            }
            // Récupération du choix
            int choix = scan.nextInt();

            if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            int num1 = scan.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int num2 = scan.nextInt();

            int resultat = 0;

            switch (choix) {
                
                case 1:
                    Addition addition = new Addition(num1, num2);
                    resultat = addition.calculer();
                    break;
                case 2:
                    Soustraction soustraction = new Soustraction(num1, num2);
                    resultat = soustraction.calculer();
                    break;
                case 3:
                    Multiplication multiplication = new Multiplication(num1, num2);
                    resultat = multiplication.calculer();
                    break;
                case 4:
                    Division division = new Division(num1, num2);
                    resultat = division.calculer();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
            
            System.out.println("Le résultat est : " + resultat);
        }
        // Fermeture du scanner pour éviter les fuites de mémoire
        scan.close();
    }
}
