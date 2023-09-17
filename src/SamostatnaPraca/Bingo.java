package SamostatnaPraca;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        Scanner zadaj = new Scanner(System.in);

        Random r = new Random();

        int maxHodnota = 10;
        int minHodnota = 1;
        int nahodneCislo = r.nextInt(maxHodnota - minHodnota + 1) + minHodnota;

        while (true) {
            System.out.println("Zadaj číslo od 1 do 10!");

            int cisloOdPouzivatela = zadaj.nextInt();

            if (cisloOdPouzivatela == nahodneCislo) {
                System.out.println("BINGO! Uhádol si!");
                break;
            } else if (cisloOdPouzivatela < nahodneCislo) {
                System.out.println("Neuhádol si! Moje číslo je väšie!");
            } else if (cisloOdPouzivatela > nahodneCislo) {
                System.out.println("Neuhádol si! Moje číslo je menšie!");
            }

        }
    }
}
