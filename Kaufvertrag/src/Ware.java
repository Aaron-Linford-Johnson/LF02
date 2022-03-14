import java.util.ArrayList;

public class Ware {
    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten;
    private ArrayList<String> maengel;

public Ware(String bezeichnung, double preis){
    this.bezeichnung = bezeichnung;
    this.preis = preis;
    besonderheiten = new ArrayList<String>();
    maengel = new ArrayList<String>();
}

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public ArrayList<String> getMaengel() {
    if (maengel.size() == 0){
       maengel.add("Keine Angabe");
    }
        return maengel;
    }

    @Override
    public String toString() {

        return  "\nBezeichnung: " + bezeichnung + "\nBeschreibung: " + beschreibung +
                "\nPreis: " + preis + "€ " + "\nBesonderheiten: " + besonderheiten + "\nMängel: " + maengel;
    }
}


