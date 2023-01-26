package objects;

public class Kiste extends Behaelter{
    private double laenge;
    private double breite;

    public Kiste(String behaelterNr, double gewichtbehaelter, double gewichtInhaltMax,
                 double hoehe, double laenge, double breite) {
        super(behaelterNr,gewichtbehaelter,gewichtInhaltMax,hoehe);
        this.breite = breite;
        this.laenge = laenge;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public String toString() {
        return  "\n\nKiste\n" + super.toString() +  "\n" +
                "Länge: " + laenge + "\n" +
                "Breite: " + breite
                + "\n------------------------------------------------";
    }
}
