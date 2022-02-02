package schritt5;

public class Ergebnis {
    private int toreHeim;
    private int toreGast;


    public int getToreHeim() {
        toreHeim ++;
        return toreHeim;
    }

    public int getToreGast() {
        toreGast ++;
        return toreGast;
    }

    @Override
    public String toString() {
        return "[Ergebnis]" +
                "\n[Heimtore]" + toreHeim +
                "\n[Gasttore]" + toreGast;
    }
}
