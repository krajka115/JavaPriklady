package SamostatnaPraca;
/*
Vytvorte dynamicke pole (prostredníctvom ArrayList), ktoré od používateľa bude žiadať zadanie číselných hodnôt - tie budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
        Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
        Poznámka: Skúsme “ošetriť” zadanie textových hodnôt tak, aby program nespadol.
        Bonusová úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
        Pozn.: Zaokrúhľovanie na 2 desatinné miesta
        https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double a = 4.565765;
        double roundOff = Math.round(a * 100.0) / 100.0;
        */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import  static org.junit.jupiter.api.Assertions.assertEquals;
import static ulohy.ScitanieVstupnychHodnotCezArrayList.zaokruhliNa2DesatinneMiesta;

public class DynamickePoliaU1 {


    public static void main(String[] args) {
        double zadajCislo = 0;
        ArrayList <Double> zoznamCisel = new ArrayList<>(); // vytvorenie Arraylistu pre ukladanie číselných hodnôt

        while (zadajCislo >= 0 ) {
                Scanner skener = new Scanner(System.in);

                System.out.println("Zadaj kladné číslo. Pre ukončenie programu zadaj záporné číslo. ");
                System.out.println("Zadaj číslo: ");

                String vstup = skener.next();
                try {
                zadajCislo = Double.parseDouble(vstup.replace(',', '.'));
                }catch (InputMismatchException e) {
                }catch (NumberFormatException e){
                    System.out.println("Vpísal si znak! Zadaj číslo: ");
                }

                zoznamCisel.add(zadajCislo); // pridá číslo do Arraylistu
                System.out.println("Zadal/a si tieto čísla: " + zoznamCisel);
                {
                }
        }

        double sum = 0 ;
        for (int i = 0; i < zoznamCisel.size() - 1; i++) {
            sum += zoznamCisel.get(i); // Metoda get(index) vrati hodnotu z dynam. pola, ked pouzijeme get(0) tak nam vrati prvy prvok
        }
        System.out.println("Sčítanie všetkých hodnôt = " + zaokruhliNa2DesatinneMiesta(sum));

        }
    }

