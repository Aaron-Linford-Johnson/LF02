package objects;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Block {
    private String name;
    private Sitzplatz[][] sitzplaetze;

    Block(String name, int anzahlReihen, int anzahlSitze) {
        this.name = name;
        this.sitzplaetze = new Sitzplatz[anzahlReihen][anzahlSitze];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
