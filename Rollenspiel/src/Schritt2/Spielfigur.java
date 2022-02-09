package Schritt2;

public abstract class Spielfigur {

    private String name;
    private int staerkepunkte;

    public Spielfigur(String name, int staerkepunkte){
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void essen() {
        setStaerkepunkte(getStaerkepunkte() + 10);
    }

    public void laufen() {
        setStaerkepunkte(getStaerkepunkte() - 1);
    }

    public void klettern() {
        setStaerkepunkte(getStaerkepunkte() - 2);
    }

    public  void  kaempfen() {
        setStaerkepunkte(getStaerkepunkte() - 3);
    }

    @Override
    public String toString() {
        return "[Spielfigur]\n" +
                "[Name] " + name +
                "\n [Stärkepunkte] " + staerkepunkte;
    }
}
