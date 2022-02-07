package schritt5;

import schritt5.Mannschaft;

import java.util.Random;

public class Gameplay {

    private static int maxDauerbisNaechsteAktion = 10;
    private static int maxSpielZeit = 90;
    private static int maxNachSpielzeit = 5;

    public static boolean brecheSpielAb(){
        Random random = new Random();
        int spielAbbruch = random.nextInt(1000);
        if (spielAbbruch == 0){
            return true;
        }
        else{
            return false;
        }
    }



private static int ermittelMannschaftsWert(Mannschaft mannschaft) {
    int mannschaftsWert = Math.max(1, mannschaft.getGesamtStaerke() * mannschaft.getGesamtMotivation() * mannschaft.getTrainer().getErfahrung());

    return mannschaftsWert;
}

    public static void spielen(Spiel spiel){

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
    Random random = new Random();
    Mannschaft offensiv;
    Mannschaft devensiv;
    // Spieldauer
    int spielDauer = maxSpielZeit + random.nextInt(maxNachSpielzeit + 1);
    // Zeit bis nächste Aktion
    int spielMinute = 1 + random.nextInt(maxDauerbisNaechsteAktion + 1);
    // Ermittelung Offensiv & Devensiv
    do {
        int heimWert = ermittelMannschaftsWert(spiel.getHeim());
        int gastWert = ermittelMannschaftsWert(spiel.getGast());
        int summe = heimWert + gastWert;
        int zufall = random.nextInt(summe + 1);
         if (zufall <= heimWert){
             offensiv = spiel.getHeim();
             devensiv = spiel.getGast();
         }
         else {
             offensiv = spiel.getGast();
             devensiv = spiel.getHeim();
         }
         // Schütze wird bestimmt
         int schuetzeNr = random.nextInt(offensiv.getSpielerliste().size());
         Spieler schuetze = offensiv.getSpielerliste().get(schuetzeNr);
         // Ermittelung Tor oder nicht
        boolean getroffen = erzieltTor(schuetze, devensiv.getTorwart());
        if (getroffen){
            schuetze.addErzielteTore();
            if (offensiv == spiel.getHeim()){
                spiel.getErgebnis().addToreHeim();
            }
            else {
                spiel.getErgebnis().addToreGast();
            }
            spiel.getSpielbericht().append(spielMinute + ": Tor von " + schuetze.getName() + "!\n");
        }
        else{
            spiel.getSpielbericht().append(spielMinute + ": Schuss von " + schuetze.getName() + "!\n");
        }
        //Nächste Aktion wird festgelegt
        spielMinute = spielMinute + random.nextInt(maxDauerbisNaechsteAktion + 1);
    }while (spielMinute <= spielDauer );

    spiel.getSpielbericht().append(spiel.getErgebnis());
        System.out.println(spiel);
    }
}







