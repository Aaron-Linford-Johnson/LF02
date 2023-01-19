package objects;

import java.util.ArrayList;

public class Hotelanlage {

    private String name;
    private Adresse adresse;
    private ArrayList<Gebaeude> gebaeudeListe;

    public Hotelanlage(String name, Adresse adresse) {
        this.adresse = adresse;
        this.name = name;
        gebaeudeListe = new ArrayList<Gebaeude>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public ArrayList<Gebaeude> getGebaeudeListe() {
        return gebaeudeListe;
    }

    public int getAnzahlGebaeude(){
        return gebaeudeListe.size();
    }

    public int getAnzahlZimmer() {
        int zaehler = 0;
        for(Gebaeude g : gebaeudeListe) {
            zaehler += g.getAnzahlZimmer();
        }
        return zaehler;
    }

    public int getAnzahlZimmerFrei() {
        int zaehler = 0;
        for(Gebaeude g : gebaeudeListe) {
            zaehler += g.getAnzahlZimmerFrei();
        }
        return zaehler;
    }

    public int getAnzahlGaeste() {
        int zaehler = 0;
        for (Gebaeude g : gebaeudeListe) {
            zaehler += g.getAnzahlGaeste();
        }
        return zaehler;
    }

    @Override
    public String toString() {
        String text = "Hotelanlage: " + name + "\n Adresse: " + adresse;
        for (Gebaeude g: gebaeudeListe) {
            text += g.toString();
        }
        return text;
    }
}


