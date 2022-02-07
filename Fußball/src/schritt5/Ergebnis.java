package schritt5;

public class Ergebnis {
    private int toreHeim;
    private int toreGast;


    public void addToreHeim() {
        toreHeim ++;

    }

    public void addToreGast() {
        toreGast ++;

    }




    @Override
    public String toString() {
        return "[Ergebnis]" +
                "\n[Heimtore]" + toreHeim +
                "\n[Gasttore]" + toreGast;
    }
}
