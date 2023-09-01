package SamostatnaPraca;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Úloha 1: Program na priradenie známky
        Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.

        Popis z pohladu pouzivate: Program vyzve pouzivatela na ciselny vstup, t.j. pocet bodov, ktoré po odobrení (stlačení klavesy ENTER) vyhodnoti a vypise zodpovedajucu znamku podla kriteria vyssie. Nasledne sa program ukonci.
        Program bude fungovať do "nekonecna" kym nezadame vstupnu hodnotu -1
*/
public class PriradenieZnamkyU1 {
    public static void main(String[] args) {
        while (true) { // Nekonecny cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj počet bodov:");
            String pocetBodov = skener.nextLine();


            if (pocetBodov.equals("q") || pocetBodov.equals("Q")) break;
            try {
                int pocetBodovAkoInt = Integer.parseInt(pocetBodov);
                if (pocetBodovAkoInt > 90) System.out.println("Tvoja známka je A");
                else if (pocetBodovAkoInt > 75) System.out.println("Tvoja známka je B");
                else if (pocetBodovAkoInt > 65) System.out.println("Tvoja známka je C");
                else System.out.println("Neviem priradiť známku k danému počtu bodov");
            } catch (NumberFormatException e) {
                System.out.println("Akceptovateľné pismeno, resp. znak je q alebo Q na ukončenie programu");
            }
        }
    }
}