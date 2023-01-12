package objects;

import exeptions.GastAlreadyCheckedInExeption;
import exeptions.GastNotCheckedInExeption;

import java.util.ArrayList;

public class Zimmer {
    private int nr;
    private ArrayList<Gast> gastListe;

    public Zimmer(int nr) {
        this.nr = nr;
        gastListe = new ArrayList<>();
    }

    public int getNr() {
        return nr;
    }

    public ArrayList<Gast> getGastListe() {
        return gastListe;
    }

    public int getAnzahlGaeste() {
        return getGastListe().size();
    }
    public void checkIn(Gast gast) throws GastAlreadyCheckedInExeption {
        for (Gast g : gastListe){
            if (gast == g) {
                throw  new GastAlreadyCheckedInExeption(gast);
            } else {
                gastListe.add(gast);
            }
        }
    }
    public void checkOut(Gast gast) throws GastNotCheckedInExeption {
        for (Gast g: gastListe) {
            if (g != gast) {
                throw new GastNotCheckedInExeption(gast);
            } else {
                gastListe.remove(g);
            }
        }
    }
}
