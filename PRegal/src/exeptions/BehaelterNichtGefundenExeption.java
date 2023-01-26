package exeptions;

public class BehaelterNichtGefundenExeption extends Exception{
    private String behaelterNr;

    public BehaelterNichtGefundenExeption(String behaelterNr) {
        this.behaelterNr = behaelterNr;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    public String getMessage() {
        return "Der Behälter mit der Nummer: " + behaelterNr + " wurde nicht gefunden!";
    }
}
