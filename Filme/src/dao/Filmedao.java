package dao;


import buisnessObjects.FilmSerie;

import java.sql.*;

public class Filmedao {

    final String CLASSNAME = "org.sqlite.JDBC";
    final String CONNECTIONSTSTRING = "jdbc:sqlite:Filme/src/data/DVD.db";

    public Filmedao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    //Read --------------------------------------------------------------------------------------
    public FilmSerie read(int nr) throws SQLException {
        FilmSerie filmSerie = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTSTRING);
            String sql = "SELECT * FROM dvd WHERE nr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, nr);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            filmSerie = createObject(resultSet);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            preparedStatement.close();
            connection.close();
        }
        return filmSerie;
    }

    //DELETE------------------------------------------------------------------------------------
    public void delete(int nr) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTSTRING);

            String spl = "DELETE FROM dvd WHERE nr = ?";
            preparedStatement = connection.prepareStatement(spl);
            preparedStatement.setInt(1, nr);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //Update------------------------------------------------------------------------------------------------
    public void update(int nr, String stringAtribut, String stringAenderung) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTSTRING);
            String sql = "UPADTE dvd SET ? = ? WHERE nr = ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, stringAtribut);
            preparedStatement.setString(2, stringAenderung);
            preparedStatement.setInt(3, nr);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //INSERT INTO -----------------------------------------------------------------------------------------------------
    public void insertInto(FilmSerie filmSerie) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTSTRING);
            String sql = "INSERT INTO dvd (titel, hauptD, genre, jahr, preis, bewertung, auflösung, dauer) VALUES (?,?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, filmSerie.getTitel());
            preparedStatement.setString(2, filmSerie.getHauptD());
            preparedStatement.setString(3, filmSerie.getGenre());
            preparedStatement.setInt(4, filmSerie.getJahr());
            preparedStatement.setDouble(5, filmSerie.getPreis());
            preparedStatement.setInt(6, filmSerie.getBewertung());
            preparedStatement.setString(7, filmSerie.getAuflösung());
            preparedStatement.setInt(8, filmSerie.getDauer());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            int nr = resultSet.getInt("Last_insert_rowid()");
            filmSerie.setNr(nr);
            System.out.println(filmSerie.getTitel() + "   " + nr);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private FilmSerie createObject(ResultSet resultSet) throws SQLException {
        int nr = resultSet.getInt("nr");
        String titel = resultSet.getString("titel");
        String hauptD = resultSet.getString("hauptD");
        String genre = resultSet.getString("genre");
        int jahr = resultSet.getInt("jahr");
        double preis = resultSet.getDouble("preis");
        int bewertung = resultSet.getInt("bewertung");
        String auflösung = resultSet.getString("auflösung");
        int dauer = resultSet.getInt("dauer");
        FilmSerie filmSerie = new FilmSerie(titel, hauptD, genre, jahr, preis, bewertung, auflösung, dauer);
        filmSerie.setNr(nr);
        return filmSerie;
    }
}


