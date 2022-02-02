package schritt5;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerliste;
    private int motivation;
    private int gesamtMotivation;
    private int staerke;
    private int gesamtStaerke;


    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerliste){
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerliste = spielerliste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGesamtMotivation() {
        for (Spieler s:spielerliste) {
           motivation += s.getMotivation();
        }
        motivation += torwart.getMotivation();
        gesamtMotivation = motivation / (spielerliste.size()+1);
        return gesamtMotivation;
    }

    public int getGesamtStaerke() {
        for (Spieler s:spielerliste) {
            staerke += s.getStaerke();
        }
        staerke += torwart.getStaerke();
        gesamtStaerke = staerke / (spielerliste.size()+1);
        return gesamtStaerke;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public ArrayList getSpielerliste() {
        return spielerliste;
    }

    public void setSpielerliste(ArrayList spielerliste) {
        this.spielerliste = spielerliste;
    }

    @Override
    public String toString() {
        return "Mannschaft: " + "\n" +
                "[Name]" + "\n" + name + "\n" +
                "[Trainer]" + trainer + '\n' +
                "[Torwart]" + torwart + '\n' +
                "[Spieler]" + "\n" +getSpielerliste() +
                "\n\n[Gesamt Motivation]" + "\n" + getGesamtMotivation() +
                "\n[Gesamt Stärke]" + "\n" + getGesamtStaerke();
    }
}

