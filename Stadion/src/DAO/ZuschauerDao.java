package DAO;

import exeptions.ZuschauerBereitsVorhandenExeption;
import exeptions.ZuschauerNichtGefundenExeption;
import objects.Zuschauer;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZuschauerDao {
    Map<String, Zuschauer> zuschauerMap = new HashMap<>();

    public void insert(Zuschauer zuschauer) throws ZuschauerBereitsVorhandenExeption {
        if(zuschauerMap.containsKey(zuschauer.getAusweisNr())) {
            throw new ZuschauerBereitsVorhandenExeption(zuschauer.getAusweisNr());
        } else {
            zuschauerMap.put(zuschauer.getAusweisNr(), zuschauer);
        }
    }

    public Zuschauer searchById(String ausweisNr) throws ZuschauerNichtGefundenExeption {
        if(!zuschauerMap.containsKey(ausweisNr)) {
            throw new ZuschauerNichtGefundenExeption(ausweisNr);
        }
         return zuschauerMap.get(ausweisNr);
    }

    public List<Zuschauer> findall() {
        return zuschauerMap.values().stream().toList();
    }

    public void update(Zuschauer zuschauer) throws ZuschauerNichtGefundenExeption {
        if (!zuschauerMap.containsKey(zuschauer.getAusweisNr())) {
            throw new ZuschauerNichtGefundenExeption(zuschauer.getAusweisNr());
        }
        zuschauerMap.replace(zuschauer.getAusweisNr(), zuschauer);
    }

    public void delete(String ausweisNr) throws ZuschauerNichtGefundenExeption {
        if (!zuschauerMap.containsKey(ausweisNr)) {
            throw new ZuschauerNichtGefundenExeption(ausweisNr);
        }
        zuschauerMap.remove(ausweisNr);
    }



}
