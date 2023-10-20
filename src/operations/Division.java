package src.operations;

/**
 * Effectue la division de deux entiers.
 */
public class Division {
    private int a;
    private int b;

    /**
     * Initialise le dividende et le diviseur.
     */
    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Retourne le résultat de la division.
     * Lève une IllegalArgumentException si le diviseur est zéro.
     */
    public int calculer() {
        if (this.b == 0) {
            throw new IllegalArgumentException("Diviseur ne peut pas être zéro.");
        }
        return this.a / this.b;
    }
}
