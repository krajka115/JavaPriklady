package SamostatnaPraca;
/*Úloha 1: Základné matematické operácie
        Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.
        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.*/
public class ZaklMatOpUloha1 {
    public static void main(String[] args) {

        double cislo1 = 21, cislo2 = 3.1;
        System.out.printf("Výsledkom sčítania hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, (cislo1 + cislo2));
        System.out.printf("Výsledkom odčítania hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, (cislo1 - cislo2));
        System.out.printf("Výsledkom násobenia hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, (cislo1 * cislo2));
        System.out.printf("Výsledkom delenia hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, (cislo1 / cislo2));
        System.out.printf("Výsledkom modulo (zvyšku po delení) hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, (cislo1 % cislo2));
    }
}
