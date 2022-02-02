package schritt5;

import java.util.Random;

public class Programm {
    public static void main(String[] args) {

        Random zufall = new Random();
        for(int i = 0; i < 100; i++){
        int u = zufall.nextInt(5)-2;
        System.out.println(u);}
    }
}
