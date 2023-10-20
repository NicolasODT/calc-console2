import java.util.Scanner;

// Importation des classes opérations
import src.CalcGest;

/**
 * Classe principale de la console de calculatrice.
 * Permet à l'utilisateur de choisir parmi différentes opérations arithmétiques.
 */
public class CalcConsole {

    /**
     * Point d'entrée principal de l'application.
     * 
     * @param args arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalcGest calcGest = new CalcGest();

        // Boucle principale de l'application, s'exécute jusqu'à ce que l'utilisateur
        // choisisse de quitter.
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
            // Récupération du choix de l'utilisateur
            int choix = scan.nextInt();

            // Si l'utilisateur choisit de quitter l'application
            if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            int num1 = scan.nextInt();
            System.out.print("Entrez le deuxième nombre : ");
            int num2 = scan.nextInt();

            // Appel de la méthode effectuerOperation de CalcGest pour effectuer l'opération
            int resultat = calcGest.effectuerOperation(choix, num1, num2);


            // Affichage du résultat de l'opération
            System.out.println("Le résultat est : " + resultat);
        }
        // Fermeture du scanner pour éviter les fuites de mémoire
        scan.close();
    }
}
