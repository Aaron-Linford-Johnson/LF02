package schritt5;

public class Spieler extends Person {

    private int staerke;
    private int torschuss;
    private int motivation;
    private int erzielteTore;

    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int erzielteTore){
        super(name,alter);
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.erzielteTore = erzielteTore;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Stärke: " + staerke + '\n' +
                "Torschuss: " + torschuss + '\n' +
                "Motivation: " + motivation + '\n' +
                "Bisher erzielte Tore: " + erzielteTore;
    }

    public int getStaerke(){
        return staerke;
    }

    public void setStaerke(int staerke){
        this.staerke = staerke;
    }

    public int getTorschuss(){
        return torschuss;
    }

    public void setTorschuss(int torschuss){
        this.torschuss = torschuss;
    }

    public int getMotivation(){
        return  motivation;
    }

    public void setMotivation(int motivation){
        this.motivation = motivation;
    }

    public int getErzielteTore(){
        return erzielteTore;
    }

    public void setErzielteTore(int erzielteTore){
        this.erzielteTore = erzielteTore;
    }

    public void addErzielteTore(){
        erzielteTore++;
    }
}
