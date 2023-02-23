package objects;

public class Zuschauer extends Person {
    private Adresse adresse;
    private String ausweisNr;
    private Gewaltbereichtschaft gewaltbereichtschaft;

   public Zuschauer(String name, int alter, String ausweisNr) {
        super(name, alter);
        this.ausweisNr = ausweisNr;
        this.gewaltbereichtschaft = Gewaltbereichtschaft.FRIEDLICH;
    }

    public Zuschauer(String name, int alter, String ausweisNr, Gewaltbereichtschaft gewaltbereichtschaft) {
       super(name, alter);
       this.ausweisNr = ausweisNr;
       this.gewaltbereichtschaft = gewaltbereichtschaft;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public Gewaltbereichtschaft getGewaltbereichtschaft() {
        return gewaltbereichtschaft;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public void setGewaltbereichtschaft(Gewaltbereichtschaft gewaltbereichtschaft) {
        this.gewaltbereichtschaft = gewaltbereichtschaft;
    }

    @Override
    public String toString() {
        return "Zuschauer\n" + adresse +
                "Ausweisnummer: " + ausweisNr + '\n' +
                "Gewaltbereitschaft: " + gewaltbereichtschaft +
                '\n';
    }
}
