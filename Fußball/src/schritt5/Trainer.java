package schritt5;


public class Trainer extends Person {


    private int erfahrung;

    public Trainer(String name, int alter, int erfahrung) {
        super(name, alter);
        this.erfahrung = erfahrung;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\n" +
                "Erfahrung: " + erfahrung;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }
}
