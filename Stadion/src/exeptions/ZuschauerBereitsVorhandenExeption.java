package exeptions;

public class ZuschauerBereitsVorhandenExeption extends Exception {
    private String zuschauerNr;

    public ZuschauerBereitsVorhandenExeption(String zuschauerNr){
        this.zuschauerNr = zuschauerNr;
    }

    public String getZuschauerNr() {
        return zuschauerNr;
    }

    @Override
    public String getMessage() {
        return "Der Zuschauer mit der ID: " + zuschauerNr + " wurde bereits in der Vergangenheit angelegt.";
    }
}
