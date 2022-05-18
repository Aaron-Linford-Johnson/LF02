package dao;

import buisnessObjects.Ware;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag2/src/data/kaufvertrag.db";

    public WareDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);

        System.out.println("Riiiiiiillllli");
    }
}
