import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class KaufvertragCSVWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Vertragspartner kaeufer = erstelleKaufvertrag().getKaeufer();
        Vertragspartner verkaeufer = erstelleKaufvertrag().getVerkaeufer();
        writeCSV(verkaeufer,kaeufer);
    }

    private static Kaufvertrag erstelleKaufvertrag() {

        //Verkäufer
        Vertragspartner verkaeufer = new Vertragspartner("Tim","Gabel");
        verkaeufer.setAusweisNr("12345");
        verkaeufer.setAdresse(new Adresse("Peter Straße","1","28277","Bremen"));


        //Käufer
        Vertragspartner kaeufer = new Vertragspartner("Aaron","Johnson");
        kaeufer.setAusweisNr("12345");
        kaeufer.setAdresse(new Adresse("King Straße","100","28277","Bremen"));

        //Ware
        Ware königskette = new Ware("Königskette",10000);
        königskette.setBeschreibung("Glizzer Glizzer Königskette. Wirklich guter Preis!");
        königskette.getBesonderheiten().add("glizert");
        königskette.getMaengel().add("Es gibt keine. Beste Kette");

        //Kaufvertrag
        Kaufvertrag kaufvertrag1 = new Kaufvertrag(kaeufer,verkaeufer,königskette);
        kaufvertrag1.setZahlungModalitaeten("Barzahlung");

        return kaufvertrag1;

    }

    public static void writeCSV(Vertragspartner verkaeufer, Vertragspartner kaeufer) throws FileNotFoundException {
        String datei = "H:/LF02 Blätter/kaufvertrag1.csv";
        PrintWriter printWriter = new PrintWriter(datei);
        printWriter.print("Vertragspartner;" + "Name;" + "Straße;" + "PLZ;" + "Ort;\n" );
        printWriter.print("Verkäufer;" + verkaeufer.getVorname() + ", " + verkaeufer.getNachname() + ";" + verkaeufer.getAdresse().getStrasse() + " " + verkaeufer.getAdresse().getHausNr() + ";" + verkaeufer.getAdresse().getPlz() + ";" + verkaeufer.getAdresse().getOrt() + ";\n");
        printWriter.println("Käufer;" + kaeufer.getVorname() + ", " + kaeufer.getNachname() + ";" + kaeufer.getAdresse().getStrasse() + " " + kaeufer.getAdresse().getHausNr() + ";" + kaeufer.getAdresse().getPlz() + ";" + kaeufer.getAdresse().getOrt());
        printWriter.close();
    }
}


