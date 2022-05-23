import buisnessObjects.Vertragspartner;
import buisnessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.util.ArrayList;

public class Programm2 {
    public static void main(String[] args) throws ClassNotFoundException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();

        Vertragspartner vertragspartner = new VertragspartnerDAO().read("1234");
        System.out.println(vertragspartner);
        System.out.println("---------------------------------------------------");
        ArrayList<Vertragspartner> vertragspartnerListe = vertragspartnerDAO.read();
       for (Vertragspartner v: vertragspartnerListe) {
        System.out.println(v);
       }

        System.out.println("-------------------------------------------------------");
        Ware ware = new WareDAO().read("2");
        System.out.println(ware);

        System.out.println("super!!!!");
    }
}
