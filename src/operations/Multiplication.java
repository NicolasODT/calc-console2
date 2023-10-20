package src.operations;

/**
 * Effectue la multiplication de deux entiers.
 */
public class Multiplication {
    private int a;
    private int b;

    /**
     * Initialise les deux nombres à multiplier.
     */
    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Retourne le résultat de la multiplication.
     */
    public int calculer() {
        return this.a * this.b;
    }
}
