public class Adresse {

    private String strasse;
    private String hausNr;
    private String plz;
    private String ort;

    public Adresse(String strasse, String hausNr, String plz, String ort){
        this.strasse = strasse;
        this.hausNr = hausNr;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNr() {
        return this.hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return this.plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return this.ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "\nStrasse: " + strasse + '\n' +
                "Hausnummer: " + hausNr + '\n' +
                "Postleitzahl: " + plz + '\n' +
                "Ort: " + ort;
    }
}
