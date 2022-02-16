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
        System.out.print("Derzeitiger Kontostand: ");
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

    public boolean einzahlen(double betrag) {
        kontoStand += betrag;
        System.out.println(betrag + "€ wurden auf ihrem Konto eingezahlt.");
        return false;
    }

    public boolean auszahlen(double betrag) {
        if (kontoStand + kreditLimit >= betrag) {
           kontoStand -= betrag;
            System.out.println(betrag + "€ wurden aus ihrem Konto ausgezahlt.");
            return true;
        }
        else {
            System.out.println("Ihr angegebner Betrag kann nicht ausgezahlt werden.");
            System.out.println("Möglicher zu auszahlender Betrag: " + (kontoStand + kreditLimit) + "€");
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nInhaber\n " + inhaber +
                "\n\nKontostand: " + kontoStand + "€" +
                "\nKreditlimit: " + kreditLimit + "€" +
                "\nZinsguthaben: " + zinsGuthaben + "€";
    }
}
