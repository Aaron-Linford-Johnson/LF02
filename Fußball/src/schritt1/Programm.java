package schritt1;

public class Programm {

    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Klaus", 31, 5);
        //trainer1.setName("Klaus");
        System.out.println(trainer1.getName());
        trainer1.setName("Claudia");
        System.out.println(trainer1.getName());
        Trainer trainer2 = new Trainer("Erik", 50, 8);
        //trainer2.setName("Erik");
        System.out.println(trainer2.getName());
        System.out.println(trainer2.getAlter());

        Spieler spieler1 = new Spieler("Aaron", 17, 10, 10, 10, 99999);
        System.out.println(spieler1);

        Torwart towart1 = new Torwart("Polta", 31, 10, 10, 10);
        System.out.println(towart1);

    }
}
