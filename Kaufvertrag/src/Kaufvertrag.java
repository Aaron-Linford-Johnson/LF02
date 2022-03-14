import java.util.ArrayList;

public class Kaufvertrag {

    private Vertragspartner verkaeufer;
    private Vertragspartner kaeufer;
    private Ware ware;
    private String zahlungModalitaeten;

    public Kaufvertrag(Vertragspartner kaeufer, Vertragspartner verkaeufer, Ware ware){
        this.kaeufer = kaeufer;
        this.verkaeufer = verkaeufer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungModalitaeten() {
        return zahlungModalitaeten;
    }

    public void setZahlungModalitaeten(String zahlungModalitaeten) {
        this.zahlungModalitaeten = zahlungModalitaeten;
    }

    @Override
    public String toString() {
        return "\n[Kaufvertrag]" + "\nVerkäufer: " + verkaeufer + "\nKäufer: " + kaeufer +
                "\nWare: " + ware + "\nZahlungmodalitäten: " + zahlungModalitaeten + "\n----------------------------------------------------\n";
    }
}
