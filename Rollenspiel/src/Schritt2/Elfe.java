package Schritt2;

public class Elfe extends Spielfigur {


    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }

    public void rennnen() {
        setStaerkepunkte(getStaerkepunkte() - 2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
