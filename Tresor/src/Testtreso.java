import java.util.ArrayList;

public class Testtreso {
    public static void main(String[] args) throws GegenstandNichtGefundenException {

        Schmuck rolex = new Schmuck(1, 12000, "Uhr (Rolex)");
        Aktie aktie = new Aktie(2,2000, "Aaron GmbH", 2);

        Tresor tresor = new Tresor();
        tresor.addGegenstand(rolex);
        tresor.addGegenstand(aktie);

        System.out.println(tresor);


        tresor.removeGegenstand(rolex);

        System.out.println(tresor);

        tresor.getGegenstand(3);

    }
}
