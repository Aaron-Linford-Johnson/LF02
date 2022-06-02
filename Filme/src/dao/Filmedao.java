package dao;

import buisnessObjects.FilmSerie;

import java.sql.*;

public class Filmedao {

    String CLASSNAME = "org.sqlite.JDBC";
    String CONNECTIONSTSTRING = "H:/LF02/Filme/src/data/DVD.db";

    public Filmedao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    public FilmSerie read(int nr) throws SQLException {
        FilmSerie filmSerie = null;
        connection = null;
       preparedStatement = null;

        try {
             connection = DriverManager.getConnection(CONNECTIONSTSTRING);
             String sql = "SELECT * FROM dvd WHERE nr = ?";
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1,nr);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            filmSerie = createObject(resultSet);


    } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return filmSerie;
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
        FilmSerie filmSerie = new FilmSerie(nr,titel,hauptD,genre,jahr,preis,bewertung,auflösung,dauer);
        return filmSerie;
    }
}
