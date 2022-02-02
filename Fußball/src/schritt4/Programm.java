package schritt4;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {


        // Mannschaft 1

        Trainer herrPossehl = new Trainer("Herr Possehl",25, 10);
        Torwart herrMüller = new Torwart("Herr Müller", 25, 10, 10,10);
        Spieler spieler1 = new Spieler("Aaron", 17, 10, 10, 10, 900);
        Spieler spieler2 = new Spieler("Seval", 18, 9, 5, 8, 700);
        Spieler spieler3 = new Spieler("Azam", 19, 9, 9, 1, 30);
        Spieler spieler4 = new Spieler("Yunus", 18, 9, 9, 9, 17);
        Spieler spieler5 = new Spieler("Herr Elfers", 18, 10, 10, 10, 999);

        ArrayList<Spieler> spielerlisteBayern = new ArrayList<>();
        spielerlisteBayern.add(spieler1);
        spielerlisteBayern.add(spieler2);
        spielerlisteBayern.add(spieler3);
        spielerlisteBayern.add(spieler4);
        spielerlisteBayern.add(spieler5);

        Mannschaft mannschaftBayern = new Mannschaft("Bayern München",herrPossehl,herrMüller,spielerlisteBayern);



        // Mannschaft 2

        Trainer gabel = new Trainer("Gabel", 35, 6);
        Torwart löffel = new Torwart("Löffel",30,7, 5,8);
        Spieler spieler21 = new Spieler("Can", 24, 6, 3, 6, 31);
        Spieler spieler22 = new Spieler("Peter", 24, 4, 7, 5, 45);
        Spieler spieler23 = new Spieler("Loper", 36, 9, 9, 9, 30);
        Spieler spieler24 = new Spieler("Kilo", 75, 9, 9, 9, 17);
        Spieler spieler25 = new Spieler("Sander", 18, 10, 10, 10, 999);

        ArrayList<Spieler> spielerListeNoobies = new ArrayList<>();
        spielerListeNoobies.add(spieler21);
        spielerListeNoobies.add(spieler22);
        spielerListeNoobies.add(spieler23);
        spielerListeNoobies.add(spieler24);
        spielerListeNoobies.add(spieler25);

        Mannschaft mannschaftBremen = new Mannschaft("Bremen", gabel, löffel, spielerListeNoobies);

        Ergebnis ergebnis = new Ergebnis();

        System.out.println(mannschaftBayern);
        System.out.println(mannschaftBremen);




        // 11-22* Spieler spieler1 = new Spieler(...);
        // ArrayList spielerListeGroeplingen = new ArrayList<>();
        // spielerListeGroeplingen.add(spieler1);
        // spielerListeGroeplingen.add(spieler2);
        // Mannschaft mannschaftGroeplingen = new Mannschaft(..., spielerListeGroeplingen);
    }
}
