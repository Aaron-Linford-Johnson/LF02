import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class KaufvertragCSVread {
    public static void main(String[] args) throws IOException {

        String datei = "H:/LF02 Blätter/Kaufvertrag1.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));
        String zeile;

        while ((zeile = br.readLine()) != null) {
            String[] array = zeile.split(";");
            for (String spalte: array) {
                System.out.println(spalte);
            }
        }
    }
}
