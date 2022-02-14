public class Konto {

    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kreditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public void einzahlen(double betrag) {
        kontoStand += betrag;
    }

    public boolean auszahlen(double betrag) {
        if (kontoStand + kreditLimit >= betrag) {
           kontoStand -= betrag;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nInhaber\n " + inhaber +
                "\n\nKontostand: " + kontoStand +
                "\nKreditlimit: " + kreditLimit +
                "\nZinsguthaben: " + zinsGuthaben
                + "\n---------------------------------------------------";
    }
}
