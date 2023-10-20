package src.operations;

/**
 * Effectue l'addition de deux entiers.
 */
public class Addition {
    private int a;
    private int b;

    /**
     * Initialise les deux nombres à additionner.
     */
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Retourne le résultat de l'addition.
     */
    public int calculer() {
        return this.a + this.b;
    }
}
