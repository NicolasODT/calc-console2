package src.operations;

public class Soustraction {
    private int a;
    private int b;

    public Soustraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculer() {
        return this.a - this.b;
    }
}
