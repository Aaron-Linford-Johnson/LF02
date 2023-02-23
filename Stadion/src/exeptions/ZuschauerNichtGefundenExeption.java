package exeptions;

public class ZuschauerNichtGefundenExeption extends Exception{
    private String zuschauerNr;

    public ZuschauerNichtGefundenExeption(String zuschauerNr) {
        this.zuschauerNr = zuschauerNr;
    }

    public String getZuschauerNr() {
        return zuschauerNr;
    }

    @Override
    public String getMessage() {
        return "Den Zuschauer mit der ID: " + zuschauerNr + " exestiert nicht.";
    }
}
