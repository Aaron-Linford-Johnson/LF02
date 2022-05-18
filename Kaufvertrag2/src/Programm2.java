import buisnessObjects.Vertragspartner;
import dao.VertragspartnerDAO;
import dao.WareDAO;

public class Programm2 {
    public static void main(String[] args) throws ClassNotFoundException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();

        Vertragspartner vertragspartner = new VertragspartnerDAO().read("1234");

        System.out.println("super!!!!");

        WareDAO wareDAO = new WareDAO();
        System.out.println("Hallo");

    }

}
