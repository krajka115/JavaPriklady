package SamostatnaPraca;
/*Úloha 1: Základné matematické operácie
        Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.
        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.
        !!!Vytvoriť matematické operácie cez metódy nevratné VOID!!!!
        */
public class ZaklMatOpMetodamiVoidUloha1 {
    public static double scitanie(double cislo1, double cislo2){
      return cislo1 + cislo2;
    }
    public static double odcitanie(double cislo1, double cislo2){
        return cislo1 - cislo2;}
    public static double nasobenie(double cislo1, double cislo2){
        return cislo1 * cislo2;
    }
    public static double delenie(double cislo1, double cislo2){
        return cislo1 / cislo2;
    }
    public static double modulo(double cislo1, double cislo2){
        return cislo1 % cislo2;
    }


    public static void vypis(String operacia, double cislo1, double cislo2, double vysledok){
        System.out.printf("%10s %s dvoch čísel %.1f a %.1f je %.1f%n", "", operacia, cislo1, cislo2, vysledok);


    }

    public static void main(String[] args) {
        double cislo1 = 21, cislo2 = 3.1;

        vypis("Sčítanie", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Odčítanie", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Násobenie", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Delenie", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo (zvyšok po delení)", cislo1, cislo2, modulo(cislo1, cislo2));
    }

}

