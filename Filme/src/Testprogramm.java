import buisnessObjects.FilmSerie;
import dao.Filmedao;

import java.sql.SQLException;

import buisnessObjects.FilmSerie;
import dao.Filmedao;

import java.sql.SQLException;

public class Testprogramm {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Filmedao filmedao = new Filmedao();
        FilmSerie filmSerie = filmedao.read(13);
        System.out.println(filmSerie);
        //------------------------------------------------------------------------------
        FilmSerie filmSerie1 = new FilmSerie("Tarzan","Tarzan","Kinderserie",2005,4.99,5,"720p",90);
        filmedao.insertInto(filmSerie1);
        //------------------------------------------------------------------------------


    }
}
