package objects;

public class Sitzplatz {
    private int reihe;
    private int sitz;
    private Block block;
    private Zuschauer zuschauer;

    Sitzplatz(Block block, int reihe, int sitz, Zuschauer zuschauer) {
        this.reihe = reihe;
        this.sitz = sitz;
        this.block = block;
        this.zuschauer = zuschauer;
    }

    public int getReihe() {
        return reihe;
    }

    public int getSitz() {
        return sitz;
    }

    public Block getBlock() {
        return block;
    }

    public Zuschauer getZuschauer() {
        return zuschauer;
    }

    @Override
    public String toString() {
        return "Sitzplatz\n\n" +
                "Reihe: " + reihe + "\n" +
                "Sitz: " + sitz + "\n" +
                block + zuschauer + '\n';
    }
}


