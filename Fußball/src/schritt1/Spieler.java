package schritt1;

public class Spieler {

    private String name;
    private int alter;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int erzielteTore;

    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int erzielteTore){
        this.name = name;
        this.alter = alter;
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.erzielteTore = erzielteTore;
    }

    @Override
    public String toString() {
        return  "Spieler:" + '\n' +
                "Name: " + name + '\n' +
                "Alter: " + alter + '\n' +
                "Stärke: " + staerke + '\n' +
                "Torschuss: " + torschuss + '\n' +
                "Motivation: " + motivation + '\n' +
                "Bisher erzielte Tore: " + erzielteTore;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAlter(){
        return alter;
    }

    public void setAlter(int alter){
        this.alter = alter;
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

}
