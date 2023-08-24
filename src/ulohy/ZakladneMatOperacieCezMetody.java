package ulohy;
// TODO vytvorit metody obdobnym sposobom pre odcitanie, nasobenie, delenie a modulo
// na odsadenie textu napr. 10 znakov zlava sme pouzili ¨%10s, k tomu sme vsak museli prdat dalsi argument, resp. prazdny text, ktory je reprezentovany ""


public class ZakladneMatOperacieCezMetody {
public static double scitanie(double cislo1, double cislo2) {
    double sucet = cislo1 + cislo2;
    return sucet;
//    return cislo1 + cislo2;

}
    public static double odcitanie(double cislo1, double cislo2) {
return cislo1 - cislo2;

    }
    public static double nasobenie(double cislo1, double cislo2) {
 return cislo1 * cislo2;

    }
    public static double delenie(double cislo1, double cislo2) {
   return cislo1 / cislo2;

    }
    public static double modulo(double cislo1, double cislo2) {
       return cislo1 % cislo2;

    }

    public static void vypis(String operacia, double cislo1, double cislo2, double vysledok){
        System.out.printf("%10s %s 2 čísel %.1f a %.1f je: %.1f%n", "", operacia, cislo1, cislo2, vysledok);

    }

    public static void main(String[] args) {
        double cislo1 = 8, cislo2 = 2.5;
//        scitanie(cislo1,cislo2);
      /*  System.out.println("Súčet 2 čísel: " + scitanie(cislo1, cislo2));
        System.out.printf("Súčet 2 čísel %.1f a %.1f je %.1f", cislo1, cislo2, scitanie(cislo1, cislo2));
        System.out.printf("Rozdiel 2 čísel %.1f a %.1f je %.1f", cislo1, cislo2, odcitanie(cislo1, cislo2));
        System.out.printf("Súčin 2 čísel %.1f a %.1f je %.1f", cislo1, cislo2, nasobenie(cislo1, cislo2));
        System.out.printf("Delenie 2 čísel %.1f a %.1f je %.1f", cislo1, cislo2, delenie(cislo1, cislo2));
        System.out.printf("Modulo (zvyšok po delení) 2 čísel %.1f a %.1f je %.1f", cislo1, cislo2, modulo(cislo1, cislo2));*/

        // výpis výsledkov matematických operácii volanie metody výpis

        vypis("Súčet", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Rozdiel", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Násobenie", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Delenie", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo(zvyšok po delení)", cislo1, cislo2, modulo(cislo1, cislo2));
    }
}
