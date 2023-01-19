package buisnessObjects;

public class FilmSerie {

    private int nr;
    private String titel;
    private String hauptD;
    private String genre;
    private int jahr;
    private double preis;
    private int bewertung;
    private String auflösung;
    private int dauer;

    public FilmSerie(String titel, String hauptD, String genre, int jahr,double preis, int bewertung, String auflösung, int dauer) {
        this.titel = titel;
        this.hauptD = hauptD;
        this.genre = genre;
        this.jahr = jahr;
        this.preis = preis;
        this.bewertung = bewertung;
        this.auflösung = auflösung;
        this.dauer = dauer;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getHauptD() {
        return hauptD;
    }

    public void setHauptD(String hauptD) {
        this.hauptD = hauptD;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    public String getAuflösung() {
        return auflösung;
    }

    public void setAuflösung(String auflösung) {
        this.auflösung = auflösung;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    @Override
    public String toString() {
        return "Film-/Seriennummer: " + nr + "\nTitel: " + titel + "\nHauptdarsteller: " + hauptD +
                "\nGenre: " + genre + "\nErscheinungsjahr: " + jahr + "\nPreis: " + preis + "\nBewertung: " + bewertung;
    }
}

