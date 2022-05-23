import buisnessObjects.Adresse;
import buisnessObjects.Kaufvertrag;
import buisnessObjects.Vertragspartner;
import buisnessObjects.Ware;

public class Programm {
    public static void main(String[] args) {
        // businessobjects.buisnessobjects.Ware anlegen.
        Ware ware = new Ware( 1,"Laptop", 250.0);
        ware.setBeschreibung("Super krasses Gaming-Laptop");
        ware.getBesonderheitenListe().add("Tasche");
        ware.getBesonderheitenListe().add("Gaming-Maus");
        ware.getMaengelListe().add("Ladekabel fehlt");
        ware.getMaengelListe().add("Touchpad defekt");
        // Käufer anlegen.
        Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));
        // Verkäufer anlegen.
        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));
        // businessobjects.buisnessobjects.Kaufvertrag anlegen.
        Kaufvertrag kaufvertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        kaufvertrag.setZahlungsModalitaeten("Privater Barverkauf");
        // businessobjects.buisnessobjects.Kaufvertrag ausgeben.
        System.out.println(kaufvertrag);
    }

}
