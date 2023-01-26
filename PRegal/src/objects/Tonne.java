package objects;

public class Tonne extends Behaelter{
    private double durchmesser;

    public Tonne(String behaelterNr, double gewichtBehaelter, double gewichtInhaltMax, double hoehe, double durchmesser) {
        super(behaelterNr, gewichtBehaelter, gewichtInhaltMax, hoehe);
        this.durchmesser = durchmesser;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(double durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public String toString() {
        return "\n\nTonne\n" + super.toString() + "\n" +
                "Durchmesser: " + durchmesser
                + "\n------------------------------------------------";
    }
}
