package dao;

import buisnessObjects.Adresse;
import buisnessObjects.Vertragspartner;

import java.sql.*;
import java.util.ArrayList;

public class VertragspartnerDAO {
   private final String CLASSNAME = "org.sqlite.JDBC";
   private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag2/src/data/kaufvertrag.db";

   public VertragspartnerDAO() throws ClassNotFoundException {
       Class.forName(CLASSNAME);
   }

    /**
     * Liest einen Vertragspartner auf Basis seiner Ausweisnummer
     * @param ausweisNr die Ausweisnummer
     * @return Der gewünschte Vertragspartner
     */

    public Vertragspartner read(String ausweisNr) {
        Vertragspartner vertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResultSet auswerten
            vertragspartner = createObject(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
        return vertragspartner;

        }
    }

    public ArrayList<Vertragspartner> read() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ArrayList<Vertragspartner> vertragspartnerListe = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner";
            preparedStatement = connection.prepareStatement(sql);



            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            vertragspartnerListe = new ArrayList<>();

            //Zeiger auf den ersten Datensatz setzen
            while (resultSet.next()){
                Vertragspartner vertragspartner = createObject(resultSet);
                vertragspartnerListe.add(vertragspartner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return vertragspartnerListe;
    }
    private Vertragspartner createObject(ResultSet resultSet) throws SQLException {

        //ResultSet auswerten
        String nr = resultSet.getString("ausweisNr");
        String vorname = resultSet.getString("vorname");
        String nachname = resultSet.getString("nachname");
        String strasse = resultSet.getString("strasse");
        String hausNr = resultSet.getString("hausNr");
        String plz = resultSet.getString("plz");
        String ort = resultSet.getString("ort");

        //Vertragspartner erstellen
        Vertragspartner vertragspartner = new Vertragspartner(vorname, nachname);
        vertragspartner.setAusweisNr(nr);
        Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
        vertragspartner.setAdresse(adresse);

        return vertragspartner;
    }
}

