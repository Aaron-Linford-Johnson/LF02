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
    }
}

