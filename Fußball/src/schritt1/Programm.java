package schritt1;

import java.util.ArrayList;

public class Programm {

    public static void main(String[] args) {

        Trainer herrPossehl = new Trainer("Herr Possehl",25,10);

        Torwart herrMüller = new Torwart("Herr Müller", 25, 10, 10,10);

        Spieler spieler1 = new Spieler("Aaron", 17, 10, 10, 10, 900);
        Spieler spieler2 = new Spieler("Seval", 18, 9, 5, 8, 700);
        Spieler spieler3 = new Spieler("Azam", 19, 9, 9, 1, 30);
        Spieler spieler4 = new Spieler("Younes", 18, 9, 9, 9, 17);
        Spieler spieler5 = new Spieler("Thomas", 18, 5, 7, 8, 30);

        ArrayList<Object> spielerlisteBayern = new ArrayList<>();
        spielerlisteBayern.add(spieler1);
        spielerlisteBayern.add(spieler2);
        spielerlisteBayern.add(spieler3);
        spielerlisteBayern.add(spieler4);
        spielerlisteBayern.add(spieler5);

        Mannschaft mannschaftBayern = new Mannschaft("Bayern München",herrPossehl,herrMüller,spielerlisteBayern);

        System.out.println(mannschaftBayern);



        // 11-22* Spieler spieler1 = new Spieler(...);
        // ArrayList spielerListeGroeplingen = new ArrayList<>();
        // spielerListeGroeplingen.add(spieler1);
        // spielerListeGroeplingen.add(spieler2);
        // Mannschaft mannschaftGroeplingen = new Mannschaft(..., spielerListeGroeplingen);
    }
}
