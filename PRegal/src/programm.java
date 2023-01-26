import exeptions.BehaelterNichtGefundenExeption;
import objects.*;

public class programm {
    public static void main(String[] args) throws BehaelterNichtGefundenExeption {

        //Kisten
        Kiste k1 = new Kiste("1001",25, 75,1.2,1.2, 1.2);
        Kiste k2 = new Kiste("1002",25, 75,1.2,1.2, 1.2);
        //Tonne
        Tonne t1 = new Tonne("2001",35, 225, 1.6,2);
        Tonne t2 = new Tonne("2001",35, 225, 1.6,2);
        //Lagerhalle
        Lagerhalle l1 = new Lagerhalle("Lager 1", new Adresse("Industrie Strasse", "1","28652","Bremen"));
        //Regal
        Regal r1 = new Regal(l1);
        //Befüllen des Regales
        r1.addBehaelter(k1);
        r1.addBehaelter(k2);
        r1.addBehaelter(t1);
        r1.addBehaelter(t2);
        //Befüllen der Behälter
        k1.setGewichtBehaelter(75);
        k2.setGewichtBehaelter(27.8);
        t1.setGewichtBehaelter(225);
        t2.setGewichtBehaelter(100);
        //Ausgabe des Regales
        System.out.println(r1);
        //t2 entfernen
        r1.removeBehaelter(t2);
        //Ausgabe des Regales
        System.out.println(r1);
        //Entfernten behälter aufrufen
        r1.getBehaelter("2002");
    }
}
