package ulohy;
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


import java.util.InputMismatchException;
import java.util.Scanner;


// TODO doplnit "nekonecne" opakovanie programu, kym nezadame
public class PriradenieZnamky {
    public static void main(String[] args) {

    //while(true) { // while reprezentuje cyklus s podmienkou na začiatku
    //    for (;;) {  //použtie miesto while(true)
       int pocetBodov = 0; //po vložení try catch, bol počet bodov len vramci tých zatvoriek zložených. Toto je inicializácia premennej, aby bola platna v celom rozsahu aj v IF, preto tam už nemusí byť int iba nazov pocetBodov

        Scanner skener = new Scanner(System.in); // inicializacia skeneru pre pouzivatesky vstup z konzoly

        //while (pocetBodov >= 0 ) { // korektne programovanie vyzaduje zadanie spravnej podmienky hned na zaciatku while
        while (pocetBodov != -1 && pocetBodov <=100) {
            System.out.println("Zadaj počet bodov:");

            try {
                pocetBodov = skener.nextInt(); // "Realny" vstup od pouzivatela, "blika" kurzor

                if (pocetBodov > 90) System.out.println("Tvoja známka je A");
                else if (pocetBodov > 75 && pocetBodov < 90) System.out.println("Tvoja známka je B");
                else if (pocetBodov > 65 && pocetBodov < 75) System.out.println("Tvoja známka je C");
                    // Ukazka ako funguje logicky vyraz alebo (or), pouzijeme tzv. pipe, tj. symbol ||, vseobecna ukazka: if ( vyraz1 || vyraz2 || vyrazN )
                    // Ukazka ako funguje logicky vyraz A (AND), použijeme, tzv. &, vseobecna ukazka: if (vyraz1 && vyraz2 && vyrazN)


                    //else if (pocetBodov == -1) System.exit(1);
                    //else if (pocetBodov < 0 ) System.exit(1);
                    //  else if (pocetBodov == -1)  break; // korektna cesta ako ukoncit cyklus, cize prikazom break
                else System.out.println("Počtu bodov nezodpovedá žiadna známka");
            } catch (InputMismatchException e) {
                System.out.println("Prepáč, zadal si nesprávny formát čísla");
                // System.exit(1);

            }
        }
        skener.close();
           }
}
