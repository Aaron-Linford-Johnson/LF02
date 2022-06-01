import buisnessObjects.Vertragspartner;
import buisnessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.util.ArrayList;

public class Programm2 {
    public static void main(String[] args) throws ClassNotFoundException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        WareDAO wareDAO = new WareDAO();

        Vertragspartner vertragspartner = new VertragspartnerDAO().read("1673");
        vertragspartnerDAO.update("1673", "Corona strasse", "1");
        vertragspartnerDAO.insertInto("8181","Erling","Haarland", "Juluiskante", "546","28277", "Bremen");
        System.out.println(vertragspartner);
        System.out.println("---------------------------------------------------");
        ArrayList<Vertragspartner> vertragspartnerListe = vertragspartnerDAO.read();
       for (Vertragspartner v: vertragspartnerListe) {
        System.out.println(v);
       }

        System.out.println("-------------------------------------------------------");
        Ware ware = new WareDAO().read("2");
        System.out.println(ware);

        ArrayList<Ware> wareListe = new WareDAO().read();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(wareListe);

        System.out.println("super!!!!");




    }
}
