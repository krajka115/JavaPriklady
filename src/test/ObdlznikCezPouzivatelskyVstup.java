package test;

import java.util.Scanner;

public class ObdlznikCezPouzivatelskyVstup {

          public static double vypocitajObvod(double stranaA, double stranaB) {
            return 2 * (stranaA + stranaB);
        }
        public static double vypocitajObsah(double stranaA, double stranaB) {
            return stranaA * stranaB;
        }

        public static void main(String[] args) {

            Scanner skener = new Scanner(System.in);
           while (true) {
               System.out.println("""
                                  Vítam ťa v programe na výpočet obsahu a obvodu obdĺžnika.
                                  Zadaj jednu z nasledujúcich možností:
                                  (s)tart = pre zadanie strán a,b a následný výpočet obsahu/obvodu
                                  (q)uit = ukončenie programu                     
                    """);
            String vstup = skener.nextLine(); // vstup pre konkretny vyber s alebo q

            if (vstup.equals("s")){
                System.out.println(" Zadaj stranu a");
                double a = skener.nextDouble();
                System.out.println(" Zadaj stranu b");
                double b = skener.nextDouble();
                System.out.println(" Obvod obdĺžnika je: " + vypocitajObvod(a, b));
                System.out.println(" Obsah obdĺžnika je: " + vypocitajObsah(a, b));
            } else if (vstup.equals("q")) break;


           }

            double a = 2.5; // Strana a
            double b = 3.5; // Strana b

            // TODO vytvoriť menu polozky s(tart) pre vstupne zadavanie stran a, b a prikaz q pre ukoncenie pogramu. Inac program bude fungovat do nekonecna.
            System.out.println("Obvod obdĺžnika je: " + test.Obdlznik.vypocitajObvod(a, b));
            System.out.println("Obsah obdĺžnika je: " + test.Obdlznik.vypocitajObsah(a, b));

        }


    }




