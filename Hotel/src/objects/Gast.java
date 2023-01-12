package objects;

public class Gast extends Person {

    private Adresse adresse;

    Gast(String vorname, String nachname, Adresse adresse){
        super(vorname, nachname);
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return super.toString() + adresse.toString();
    }
}
