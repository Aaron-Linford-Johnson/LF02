package objects;

import java.util.ArrayList;

public class Gebaeude {
    private String name;
    private ArrayList<Etage> etagenListe;

    public Gebaeude(String name) {
        this.name = name;
        etagenListe = new ArrayList<Etage>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etage> getEtagenListe() {
        return etagenListe;
    }

    public int getAnzahlEtagen() {
        return getEtagenListe().size();
    }

    public int getAnzahlZimmer() {
        int zaehler = 0;
        for (Etage e: etagenListe) {
            zaehler += e.getAnzahlzimmer();
        }
        return zaehler;
    }

    public int getAnzahlZimmerFrei() {
        int zaehler = 0;
        for(Etage e: etagenListe) {
            zaehler += e.getAnzahlzimmerFrei();
        }
        return zaehler;
    }
    public int getAnzahlGaeste() {
        int zaehler = 0;
        for(Etage e: etagenListe) {
            zaehler += e.getAnzahlGaeste();
        }
        return zaehler;
    }

    @Override
    public String toString() {
        String text = "\nGebäude: " + this.name;
        for (Etage e: etagenListe) {
            text += e.toString();
        }
        text += "gesamt: , Zimmer: " + getAnzahlZimmer() + ", Zimmer frei: " +
                getAnzahlZimmerFrei() + ", Gäste: " + getAnzahlGaeste() + "\n";
        return text;
    }
}
