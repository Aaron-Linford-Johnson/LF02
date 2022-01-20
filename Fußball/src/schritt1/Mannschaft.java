package schritt1;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList spielerliste;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList spielerliste){
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
                "[Name]: " + name + '\n' +
                "[Trainer]: " + trainer + '\n' +
                "[Torwart]: " + torwart + '\n' +
                "[Spieler]: " + spielerliste;
    }
}
