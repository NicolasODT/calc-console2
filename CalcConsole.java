import java.util.Scanner;
import src.operations.*;

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

            int choix = scan.nextInt();

            if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            int num1 = scan.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int num2 = scan.nextInt();

                switch (choix) {
                    case 1:
                        System.out.println("Résultat de l'addition: " + Addition.calculer(num1, num2));
                        break;
                    case 2:
                        System.out.println("Résultat de la soustraction: " + Soustraction.calculer(num1, num2));
                        break;
                    case 3:
                        System.out.println("Résultat de la multiplication: " + Multiplication.calculer(num1, num2));
                        break;
                    case 4:
                        System.out.println("Résultat de la division: " + Division.calculer(num1, num2));
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                        break;
                }
        }
        scan.close();
    }
}
