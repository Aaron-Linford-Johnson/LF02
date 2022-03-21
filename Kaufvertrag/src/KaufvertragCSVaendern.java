import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KaufvertragCSVaendern {

    public static void main(String[] args) throws IOException {
        String datei = "H:/LF02 Blätter/Kaufvertrag1.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));

        String zeile;
        //Käufer Name
        String nachnameK = null;
        String vornameK = null;
        //Verkäufer Name
        String vornameV = null;
        String nachnameV = null;

        while ((zeile = br.readLine()) != null) {

            String[] datensatz = zeile.split(";");
            if (datensatz[0].equalsIgnoreCase("Käufer")) {
                String[] name = datensatz[1].split(", ");
                Adresse adresseKaeufer = erstellestrassenHausNr(datensatz);
                vornameK = name[0];
                nachnameK = name[1];
            }
        }

        while ((zeile = br.readLine()) != null) {

            String[] datensatz2 = zeile.split(";");
            if (datensatz2[0].equalsIgnoreCase("Verkäufer")) {
                String[] name = datensatz2[1].split(", ");
                Adresse adresseVerkaeufer = erstellestrassenHausNr(datensatz2);
                vornameV = name[0];
                nachnameV = name[1];

            }
        }

        Vertragspartner kaeufer = new Vertragspartner(vornameK, nachnameK);
        Vertragspartner verkaeufer = new Vertragspartner(vornameV, nachnameV);

        System.out.println(kaeufer);

    }

    private static Adresse erstellestrassenHausNr(String[] datensatz) {

        String[] strassenHausNr = datensatz[2].split(" ");
        String hausNr = strassenHausNr[strassenHausNr.length-1];
        String strasse = " ";

        for (int i = 0; i < strassenHausNr.length-1; i++) {
            strasse += strassenHausNr[i] + " ";
        }

        strasse = strasse.trim();
        String plz = datensatz[3];
        String ort = datensatz[4];

        Adresse adresse = new Adresse(strasse,hausNr,plz,ort);

        return adresse;
    }
}
