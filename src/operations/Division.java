package src.operations;

public class Division {
    private int a;
    private int b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculer() {
        if (this.b == 0) {
            throw new IllegalArgumentException("0");
        }
        return this.a / this.b;
    }
}
