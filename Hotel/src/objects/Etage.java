package objects;

import java.util.ArrayList;

public class Etage {
    private String name;
    private ArrayList<Zimmer> zimmerListe;

    public Etage(String name) {
        this.name = name;
        zimmerListe = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    public int getAnzahlzimmer() {
        return getZimmerListe().size();
    }

    public int getAnzahlzimmerFrei() {
        int zaehler = 0;
        for (Zimmer z: zimmerListe) {
            if(z.getAnzahlGaeste() == 0) {
                zaehler++;
            }
        }
        return zaehler;
    }

    public int getAnzahlGaeste() {
        int zaehler = 0;
        for (Zimmer z : zimmerListe) {
           zaehler += z.getAnzahlGaeste();
        }
        return zaehler;
    }

    @Override
    public String toString() {
        return "Etage: " + name +", Zimmer: " + getAnzahlzimmer() + ", Zimmer frei: " + getAnzahlzimmerFrei() +
                ", Gäste: " + getAnzahlGaeste() + "\n";
    }
}

