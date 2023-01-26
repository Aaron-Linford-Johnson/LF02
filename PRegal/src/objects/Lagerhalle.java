package objects;

public class Lagerhalle {
    private String name;
    private Adresse adresse;

    public Lagerhalle(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "\n\nLagerhalle\n" +
                "Name: " + name
                + adresse.toString();

    }
}
