package src.operations;

/**
 * Effectue la soustraction de deux entiers.
 */
public class Soustraction {
    private int a;
    private int b;

    /**
     * Initialise les deux nombres à soustraire.
     */
    public Soustraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Retourne le résultat de la soustraction.
     */
    public int calculer() {
        return this.a - this.b;
    }
}
