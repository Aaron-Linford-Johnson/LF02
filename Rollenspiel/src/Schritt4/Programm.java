package Schritt4;


public class Programm {
    public static void main(String[] args) throws KeineKraftException {

        Elfe azam = new Elfe("Azam", 1);

        try {
            azam.rennnen();
            System.out.println("Azam rennt.");
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }
    }
}
