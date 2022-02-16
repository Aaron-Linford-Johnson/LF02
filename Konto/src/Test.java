public class Test {

    public static void main(String[] args) {

        Mitarbeiter yunus = new Mitarbeiter("Yunus", "Ersoy");
        Kunde azam = new Kunde("Azam", "Alali", yunus);
        Adresse azamAdresse = new Adresse("Einhorn Strasse", "49", "28201", "Raqqa");
        azam.setAdresse(azamAdresse);
        Sparkonto sparkonto1 = new Sparkonto(azam, 0);

        sparkonto1.einzahlen(50000.00);
        System.out.println(sparkonto1);

        System.out.println("[Bericht]");
        sparkonto1.auszahlen(60000);
        System.out.println(sparkonto1.getKontoStand() + "€");
        sparkonto1.auszahlen(25000);
        sparkonto1.einzahlen(200);
        System.out.println(sparkonto1.getKontoStand());
        System.out.println("---------------------------------------------------");

        Mitarbeiter azama = new Mitarbeiter("Azam", "Alali");
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Tim", "Lopert");
        Kunde aaron = new Kunde("Aaron", "Johnson",azama );
        Kunde kunde3 = new Kunde("Tallah", "Kenck", mitarbeiter3);

        Girokonto girokonto1 = new Girokonto(aaron,1000,0,0);
        Girokonto girokonto3 = new Girokonto(kunde3,0,0,0 );

        System.out.println(girokonto1);

        System.out.println("[Bericht]");
        girokonto1.einzahlen(100);
        girokonto1.auszahlen(1100);
        System.out.println(girokonto1.getKontoStand() + "€");
        girokonto1.einzahlen(10000);
        girokonto1.ueberweisen(500,girokonto3);
        System.out.println(girokonto1.getKontoStand() + "€");
        System.out.println("---------------------------------------------------");


    }
}
