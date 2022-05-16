package dao;

public class VertragspartnerDAO {
   private final String CLASSNAME = "org.sqlite.JDBC";
   private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag2/src/data/kaufvertrag.db";

   public VertragspartnerDAO() throws ClassNotFoundException {
       Class.forName(CLASSNAME);
   }
}
