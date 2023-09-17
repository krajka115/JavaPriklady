package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihSpravneEfektivneVypisanieKonstruktory {
    public static void main(String[] args) {
        KnihaSpravne kniha1 = new KnihaSpravne("Java", "Ján Žitniak", 2000, 3.89); // vytvorili sme objekt (instanciu tiredy) Kniha


        System.out.println("\nVypíš detail knihy: ");
        System.out.println("___________________");
        System.out.println(kniha1);

        KnihaSpravne kniha2 = new KnihaSpravne("Já, robot", "Isaac Asimov", 1960, 2.09);

        System.out.println("\nVypíš detail knihy č.2: ");
        System.out.println("_______________________");
        System.out.println(kniha2);

        //knihy uložíme do ArrayList-u
        ArrayList<KnihaSpravne> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        System.out.println("\nVypisujem zoznam všetkých kníh v ArrayList-e: ");
        System.out.println("_______________________________________________");
        //vypísanie obsahu kníh
        System.out.println(knihy); // vypíse pre cloveka nezrozumitelný text ako napr. [oop.enkapsulacia.Kniha@b4c966a, oop.enkapsulacia.Kniha@2f4d3709]
        for (KnihaSpravne knihaObjekt : knihy) {
            //System.out.println(knihaObjekt); // vypíse pre človeka nezrozumitelný text ako napr. oop.enkapsulacia.Kniha@b4c966a a oop.enkapsulacia.Kniha@2f4d3709
            System.out.println(); //prázdny riadok
            System.out.println(knihaObjekt);

        }
    }
}
