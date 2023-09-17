package ulohy;

import java.util.Arrays;

/*
Úloha č. 1: Úloha na základné Excel funkcie.
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), ktorá vypočíta priemer z daných čísiel.
        Bonusové úlohy naviac: Vytvorte metódu pocet(), ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti najmenšie číslo v poli.
*/
public class ZakladneExcelFunkcie {

    public static void main(String[] args) {
        double [] cisla = {10, 5, 30, 8, 50}; // Vytvorenie a naplnenie pola s desatinnymi cislami

        double sum = scitaj(cisla);
        System.out.println("Výsledok sčítania hodnôt v poli je: " + sum);

        double priemer = priemeruj(cisla);
        System.out.println("Výsledok priemerovania hodnôt v poli je: " + priemer);

        double priemerEfektivne = priemerujEfektivne(cisla);
        System.out.println("Výsledok EFEKTIVNÉHO priemerovania hodnôt v poli je: " + priemerEfektivne);

        System.out.println("Počet: " + pocet(cisla));
        System.out.println("Max: " + max(cisla));
        System.out.println("Max zoradením: " + maxZoradenim(cisla));
        System.out.println("Min: " + min(cisla));
        System.out.println("Min zoradením: " + minZoradenim(cisla));

    }

    // Metoda na scitanie hodnot v poli
    private static double scitaj(double[] cisla) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            //sum = sum + cisla[i];
            sum += cisla[i]; // Identicky vyznam ako riadok vyssie
        }
        return sum;
    }

    // Metoda na priemerovanie hodnot v poli
    private static double priemeruj(double[] cisla) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            //sum = sum + cisla[i];
            sum += cisla[i]; // Identicky vyznam ako riadok vyssie
        }
        return sum / cisla.length;
    }

    // Metoda na efektivne priemerovanie hodnot v poli
    private static double priemerujEfektivne(double[] cisla) {
        return scitaj(cisla) / cisla.length;
    }

    private static double pocet(double[] cisla) {
        return cisla.length;
    }

    private static double max(double[] cisla) {
        return Arrays.stream(cisla).max().getAsDouble();
    }

    private static double min(double[] cisla) {
        return Arrays.stream(cisla).min().getAsDouble();
    }

    private static double maxZoradenim(double[] cisla) {
        Arrays.sort(cisla); // Zoradenie cisiel od najmensieho po najvacsie, cize zoradi takto: 5, 8, 10, 30, 50
        return cisla[cisla.length-1]; // Vyberie, resp. vrati posledne cislo v poli
    }

    private static double minZoradenim(double[] cisla) {
        Arrays.sort(cisla); // Zoradenie cisiel od najmensieho po najvacsie, cize zoradi takto: 5, 8, 10, 30, 50
        return cisla[0]; // Vyberie, resp. vrati prve cislo v poli
    }

    // TODO Do 18.40
    // TODO Vytvor metodu s nazvom pocet na zistenie poctu vstupnych hodnot (pola)
    // TODO Vytvor metodu s nazvom max na ziskanie najvyssej hodnoty
    // TODO Vytvor metodu s nazvom min na ziskanie najnizsej hodnoty
    // Arrays.sort(cisla); // zoradi cisla od najmensieho po najvacsie
}