package src.operations;

public class Division {

    // Méthode pour diviser deux nombres
    public static double calculer(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Le diviseur ne peut pas être zéro.");
        }
        return a / b;
    }
}
