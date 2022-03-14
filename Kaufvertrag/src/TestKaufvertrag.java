import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestKaufvertrag {
    public static void main(String[] args) throws FileNotFoundException {


        Adresse adresse1 = new Adresse("Peter Straße", "1", "28277", "Bremen");
        Vertragspartner kaeufer1 = new Vertragspartner("Tim", "Gabel");
        Vertragspartner verkaeufer1 = new Vertragspartner("Schwam", "Drüber");
        Ware ware1 = new Ware("Königskette", 10000);

        Kaufvertrag kaufvertrag1 = new Kaufvertrag(kaeufer1, verkaeufer1, ware1);

        kaeufer1.setAusweisNr("012345");
        kaeufer1.setAdresse(new Adresse("Heual Straße", "13","28277", "Bremen"));

        String datei = "Kaufvertrag/Kaufvertrag.txt";
        PrintWriter writer = new PrintWriter(datei);

        writer.println(kaufvertrag1);

        writer.close();
    }
}
