package ulohy;

import java.util.FormatterClosedException;
import java.util.Scanner;

/*
Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).
        Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí, ináč beží do “nekonečna”.
        Program po spustení zobrazí menu položky, ktoré môžu vyzerať nasledovne:
        Vítam Ťa v programe na výpočet obvodu a obsahu obdĺžnika. Zadaj jednu s nasledujúcich možností:
        (s)tart = pre zadanie strán a, b a následný výpočet obsahu / obvodu
        (q)uit = ukončenie programu

        Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.
        Update programu, vylepšená verzia by mohla robiť toto:
        Popis programu:
        Po spustení programu vypíše jednoduché menu, kde používateľ zadá možnosť:
        s alebo q
        pričom písmeno s od používateľa bude žiadať zadanie strán a, b. Po zadaní týchto strán vypočíta obvod a obsah obdlžnika a zobrazí ho do konzoly. Toto bude opakovať dovtedy, kým v menu nezadáme písmeno q. Po zadaní písmena q, program ukončí svoju činnosť a vypíše Koniec programu.
        */
public class Obdlznik {

    public static double obvodObdlznika(double stranaA, double stranaB) {
        double vypocet = 2 * (stranaA + stranaB);
        return (vypocet);
    }

    public static double obsahObdlznika(double stranaA, double stranaB) { return stranaA * stranaB; }


    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.println("""
                    Vítam Ťa v programe na výpočet obvodu a obsahu obldĺžnika! 
                    Zadaj: 
                    (s)tart = pre zadanie strán a, b a následný výpočet obsahu / obvodu
                    (q)uit = ukončenie programu
                    """);

        while (true) {


            String zadaj = skener.nextLine();
      try {
          if (zadaj.equalsIgnoreCase("s")) {
              System.out.println(" Zadaj dĺžku strany a: ");
              double a = skener.nextDouble();
              System.out.println(" Zadaj dĺžku strany b: ");
              double b = skener.nextDouble();

              System.out.println(" Obvod obdĺžnika je: " + obvodObdlznika(a, b));
              System.out.println(" Obsah obdĺžnika je: " + obsahObdlznika(a, b));


          } else if (zadaj.equals("q") || zadaj.equals("Q")) {
              System.out.println(" Program ukončený! ");
              break;
          }
          else  {
              System.out.println(" Zadaj správnu hodnotu pre pokračovanie! ");}
        }catch (Exception e) {System.out.println(" Zadaj číselnú hodnotu strany! ");
        }

            System.out.println(); // prázdny riadok





        }
    }
}