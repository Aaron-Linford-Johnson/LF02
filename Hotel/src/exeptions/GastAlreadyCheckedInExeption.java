package exeptions;

import objects.Gast;

public class GastAlreadyCheckedInExeption extends Exception {
    private Gast gast;

    public GastAlreadyCheckedInExeption(Gast gast) {
        this.gast = gast;
    }

    public String getMessage() {
        return gast.getVorname() + " " + gast.getNachname() + " ist bereits eingechecked.";
    }
}
