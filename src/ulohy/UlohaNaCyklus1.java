package ulohy;
/*
Úloha na opakovanie č.1: Vypíš maticu s údajmi od 1 do 25
        Vytvorte (vypíšte) maticu údajov do konzoly, ktorá budú vyzerať nasledovne:
   1 2 3 4 5
   6 7 8 9 10
   11 12 13 14 15
   16...
*/


public class UlohaNaCyklus1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + "\t");
            if (i % 5 == 0) System.out.println();
        }


        }
    }

