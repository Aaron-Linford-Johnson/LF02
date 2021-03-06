package dao;

import buisnessObjects.Adresse;
import buisnessObjects.Vertragspartner;
import buisnessObjects.Ware;

import java.sql.*;
import java.util.ArrayList;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag2/src/data/kaufvertrag.db";


    public WareDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

        /**
         * Liest eine Ware auf Basis seiner Warennummer
         * @param warenNR die Warennummer
         * @return Die gewünschte Warennummer
         */

        public Ware read(String warenNR) {
            Ware ware = null;
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            // Verbindung zu Datenbank herstellen
            try {
                connection = DriverManager.getConnection(CONNECTIONSTRING);

                //SQL-Abfrage erstellen
                String sql = "SELECT * FROM ware WHERE warenNR = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, warenNR);

                //SQL-Abfrage erstellen
                ResultSet resultSet = preparedStatement.executeQuery();

                //Zeiger auf den ersten Datensatz setzen
                resultSet.next();

                //ResultSet auswerten und Ware erstellen
               ware = createObject(resultSet);

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            return ware;
        }
// Zweites ------------------------------------------------------------------------------------------------------------------------------
    public ArrayList<Ware> read() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ArrayList<Ware> warenListe = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM Ware";
            preparedStatement = connection.prepareStatement(sql);



            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            warenListe = new ArrayList<>();

            //Zeiger auf den ersten Datensatz setzen
            while (resultSet.next()) {

            //ResultSet auswerten und Ware erstellen
                Ware ware = createObject(resultSet);
                warenListe.add(ware);
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
        return warenListe;
    }

    public void delete(String WarenNr) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "DELETE FROM ware WHERE WarenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, WarenNr);

            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(String warenNr, String preis, String beschreibung) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "UPDATE ware SET beschreibung = ?,preis = ? WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, beschreibung );
            preparedStatement.setString(2, preis);
            preparedStatement.setString(3, warenNr);


            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertInto(Ware ware) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String besonderheitenString;
        String maengelString;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "INSERT INTO ware VALUES (?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ware.getBezeichnung() );
            preparedStatement.setString(2, ware.getBeschreibung());
            preparedStatement.setDouble(3, ware.getPreis());
            besonderheitenString = ware.getBesonderheitenListe().toString();
            maengelString = ware.getMaengelListe().toString();
            preparedStatement.setString(4, besonderheitenString);
            preparedStatement.setString(5, maengelString);
            //SQL-Abfrage ausführen
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            int warenNr = resultSet.getInt("Last_insert_rowid()");
            ware.setWarenNr(warenNr);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private Ware createObject(ResultSet resultSet) throws SQLException {
        int nr = resultSet.getInt("WarenNr");
        String bezeichnung = resultSet.getString("bezeichnung");
        String bechreibung = resultSet.getString("beschreibung");
        double preis = resultSet.getDouble("preis");
        String besonderheiten = resultSet.getString("besonderheiten");
        String maengel = resultSet.getString("maengel");

        Ware ware = new Ware(nr,bezeichnung, preis);
        ware.setBeschreibung(bechreibung);
        if (besonderheiten != null) {
            String[] besonderheitenArray = besonderheiten.split("; ");
            for (String b : besonderheitenArray) {
                ware.getBesonderheitenListe().add(b.trim());
            }
        }

        if (maengel != null) {
            String[] maengelArray = maengel.split("; ");
            for (String m : maengelArray) {
                ware.getMaengelListe().add(m.trim() );
            }
        }

        return ware;
    }
}
