package buisnessObjects;

import java.util.ArrayList;

public class Ware {

    private int warenNr;
        private String bezeichnung;
        private String beschreibung;
        private double preis;
        private ArrayList<String> besonderheitenListe;
        private ArrayList<String> maengelListe;

        /**
         * Konstruktor.
         *
         * @param bezeichnung Die Bezeichnung der buisnessobjects.Ware.
         * @param preis       Der Preis der buisnessobjects.Ware.
         */
        public Ware(int warenNr, String bezeichnung, double preis) {
           this.warenNr = warenNr;
            this.bezeichnung = bezeichnung;
            this.preis = preis;
            besonderheitenListe = new ArrayList<String>();
            maengelListe = new ArrayList<String>();
        }

        /**
         * Gibt die Bezeichnung der buisnessobjects.Ware aus.
         *
         * @return Die Bezeichnung der buisnessobjects.Ware.
         */
        public String getBezeichnung() {
            return bezeichnung;
        }

        /**
         * Aktualisiert die Bezeichnung der buisnessobjects.Ware.
         *
         * @param bezeichnung Die neue Bezeichnung der buisnessobjects.Ware.
         */
        public void setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
        }

        /**
         * Gibt die Beschreibung der buisnessobjects.Ware aus.
         *
         * @return Die Beschreibung der buisnessobjects.Ware.
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Aktualisiert die Beschreibung der buisnessobjects.Ware.
         *
         * @param beschreibung Die neue Beschreibung der buisnessobjects.Ware.
         */
        public void setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
        }

        /**
         * Gibt den Preis der buisnessobjects.Ware aus.
         *
         * @return Der Preis der buisnessobjects.Ware.
         */
        public double getPreis() {
            return preis;
        }

        /**
         * Aktualisiert den Preis der buisnessobjects.Ware.
         *
         * @param preis Der neue Preis der buisnessobjects.Ware.
         */
        public void setPreis(double preis) {
            this.preis = preis;
        }

        /**
         * Gibt die Liste der Besonderheiten der buisnessobjects.Ware aus.
         *
         * @return Die Liste der Besonderheiten der buisnessobjects.Ware.
         */
        public ArrayList<String> getBesonderheitenListe() {
            return besonderheitenListe;
        }

        /**
         * Gibt die Liste der Mängel der buisnessobjects.Ware aus.
         *
         * @return Die Liste der Mängel der buisnessobjects.Ware.
         */
        public ArrayList<String> getMaengelListe() {
            return maengelListe;
        }

    public int getWarenNr() {
        return warenNr;
    }

    public void setWarenNr(int warenNr) {
        this.warenNr = warenNr;
    }

    /**
         * (non-Javadoc)
         *
         * @see Object#toString()
         */
        @Override
        public String toString() {
            String text = bezeichnung;
            text += "\n\t\tBeschreibung: " + beschreibung;
            text += "\n\t\tPreis: " + preis;
            text += "\n\t\tBesonderheiten: " + besonderheitenListe;
            text += "\n\t\tMängel: " + maengelListe;
            return text;
        }
    }

