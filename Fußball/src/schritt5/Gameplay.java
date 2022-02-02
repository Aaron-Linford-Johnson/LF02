package schritt5;

import schritt5.Mannschaft;

import java.util.Random;

public class Gameplay {

    private int maxDauerbisNaechsteAktion = 10;


private static int ermittelMannschaftsWert(Mannschaft mannschaft) {
    int mannschaftsWert = Math.max(1, mannschaft.getGesamtStaerke() * mannschaft.getGesamtMotivation() * mannschaft.getTrainer().getErfahrung());

    return mannschaftsWert;
}


    private static boolean erzieltTor(Spieler schuetze, Torwart torwart){
    boolean tor = false;
    Random zufall = new Random();
    int zufallSchuetze = zufall.nextInt(5)-2;
    int zufallTorwart = zufall.nextInt(5)-2;
    if (Math.max(1,schuetze.getTorschuss() + zufallSchuetze) > Math.max(1,torwart.getReaktion() + zufallTorwart)) {
         tor = true;

    }return tor;
}

    public static void spielen(Spiel spiel){
    Random spielZeit = new Random();
    int maxNachSpielzeit = spielZeit.nextInt(5);
    int maxSpielZeit = 90;
    int gesamtSpielZeit = maxSpielZeit + maxNachSpielzeit;

    }
}







