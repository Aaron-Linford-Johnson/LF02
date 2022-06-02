import buisnessObjects.FilmSerie;
import dao.Filmedao;

import java.sql.SQLException;

public class Testprogramm {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Filmedao filmedao = new Filmedao();
         FilmSerie filmSerie = filmedao.read(1);
        System.out.println(filmSerie.getGenre());

    }
}
