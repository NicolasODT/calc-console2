import src.CalcGest;
import src.CalcConsole;

public class Main {
    public static void main(String[] args) {
        CalcGest calcGest = new CalcGest();
        CalcConsole console = new CalcConsole(calcGest);
        console.demarrer();
    }
}
