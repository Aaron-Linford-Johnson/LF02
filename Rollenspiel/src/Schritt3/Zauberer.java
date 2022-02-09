package Schritt3;

public class Zauberer extends Spielfigur {

    private int zauberpunkte;

    public Zauberer(String name, int staerkepunkte, int zauberpunkte ) {
        super(name, staerkepunkte);
        this.zauberpunkte = zauberpunkte;
    }

    public int getZauberpunkte() {
        return  zauberpunkte;
    }

    public void trinkenZaubertrank() {
        this.zauberpunkte = zauberpunkte + 3;
    }

    public void zaubern() {
        this.zauberpunkte = zauberpunkte - 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
