package ulohy;

import java.util.Date;

public class PremenneCezVar {
    public static void main(String[] args) {
        var meno = "Ján";
        var priezvisko = "Žitniak";
        var menoPriezvisko = meno + " " + priezvisko;
        System.out.println("Moje meno a priezvisko je: " + menoPriezvisko);

        var a = 10;
        var b = 20;
        var c = "30";
        var sucet = a+b;
        var sucet3cisel = a+b+c;
        System.out.println("Súčet a b je: " + (a+b));
        System.out.println("Súčet a b je: " + sucet);
        System.out.println("Súčet troch čísel, z toho jedno číslo je text: " + sucet3cisel);

        var aktualnyDatum = new Date();
        System.out.println("Aktuálny dátum a čas je: " + aktualnyDatum);
    }
}