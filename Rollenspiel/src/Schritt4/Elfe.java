package Schritt4;


public class Elfe extends Spielfigur {


    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }

    public void rennnen() throws KeineKraftException {
        if (getStaerkepunkte() - 2 >= 0) {
        setStaerkepunkte(getStaerkepunkte() - 2);
        }
        else {
            throw new KeineKraftException(getName(), "rennen");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
