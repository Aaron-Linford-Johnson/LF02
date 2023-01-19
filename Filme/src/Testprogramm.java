import buisnessObjects.FilmSerie;
import dao.Filmedao;

import java.sql.SQLException;

import buisnessObjects.FilmSerie;
import dao.Filmedao;

import java.sql.SQLException;

public class Testprogramm {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Filmedao filmedao = new Filmedao();
        //READ------------------------------------------------------------------------------
        FilmSerie filmSerie = filmedao.read(13);
        System.out.println(filmSerie);
        //INSERT INTO------------------------------------------------------------------------------
        FilmSerie filmSerie1 = new FilmSerie("Tarzan","Tarzan","Kinderserie",2005,4.99,5,"720p",90);
        filmedao.insertInto(filmSerie1);
        //UPDATE------------------------------------------------------------------------------
        filmedao.update(1,"Fanta");
        //DELETE------------------------------------------------------------------------------
        filmedao.delete(14);


    }
}
