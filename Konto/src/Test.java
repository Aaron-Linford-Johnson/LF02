public class Test {

    public static void main(String[] args) {

        Mitarbeiter yunus = new Mitarbeiter("Yunus", "Ersoy");
        Kunde azam = new Kunde("Azam", "Alali", yunus);
        Adresse azamAdresse = new Adresse("Einhorn Strasse", "49", "28201", "Raqqa");
        azam.setAdresse(azamAdresse);
        Sparkonto sparkonto1 = new Sparkonto(azam, 0);

        sparkonto1.einzahlen(50000.00);
        System.out.println(sparkonto1);
        sparkonto1.auszahlen(60000);

        Mitarbeiter azama = new Mitarbeiter("Azam", "Alali");
        Kunde aaron = new Kunde("Aaron", "Johnson",azama );
    }
}
