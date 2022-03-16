import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class KaufvertragCSVWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Kaufvertrag kaufvertrag1 = erstelleKaufvertrag();
        writeCSV(kaufvertrag1);
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

    public static void writeCSV(Kaufvertrag kaufvertrag) throws FileNotFoundException {
        String datei = "H:/LF02 Blätter/kaufvertrag.csv";
        PrintWriter printWriter = new PrintWriter(datei);
        printWriter.println(kaufvertrag);
        printWriter.close();
    }
}


