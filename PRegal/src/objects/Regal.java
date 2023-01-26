package objects;

import exeptions.BehaelterNichtGefundenExeption;

import java.util.ArrayList;

public class Regal {
    private Lagerhalle lagerhalle;
    private ArrayList<Behaelter> behaelterListe;

    public Regal(Lagerhalle lagerhalle) {
        this.lagerhalle = lagerhalle;
        behaelterListe = new ArrayList<Behaelter>();
    }

    public Lagerhalle getLagerhalle() {
        return lagerhalle;
    }

    public void addBehaelter(Behaelter behaelter) {
        behaelterListe.add(behaelter);
    }

    public void removeBehaelter(Behaelter behaelter) throws BehaelterNichtGefundenExeption {
                behaelterListe.remove(behaelter);
    }

    public Behaelter getBehaelter(String behaelterNr) throws BehaelterNichtGefundenExeption {
        Behaelter behaelter = null;
        for(Behaelter b : behaelterListe) {
            if (b.getBehaelterNr() == behaelterNr ) {
                behaelter = b;
            }
            if (behaelter == null) {
                throw new BehaelterNichtGefundenExeption(behaelterNr);
            }
        }
        return behaelter;
    }

    public int getAnzahlBehaelter() {
        return behaelterListe.size();
    }

    public double getGewichtGesamt() {
        double zaehler = 0;
        for (Behaelter b : behaelterListe) {
            zaehler += b.getGewichtInhalt() + b.getGewichtBehaelter();
        }
        return  zaehler;
    }

    @Override
    public String toString() {
        return  "\n\nInformation zum Regal\n" +
                "---------------------------" +
                lagerhalle + "\n" +
                "Liste der Behälter: \n\n" + behaelterListe;
    }
}
