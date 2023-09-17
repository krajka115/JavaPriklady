package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnih {
    public static void main(String[] args) {
        // vytvorenie prvej knihy
        Kniha kniha1 = new Kniha(); // vytvorili sme objekt alebo instanciu triedy s názvom kniha1
        kniha1.nazov = "Java";
        kniha1.autor = "Ján Žitniak";
        kniha1.cena = 2.30;
        kniha1.rokVydania = 1999;

        // ako vypísať obsah kniha1
        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Autor knihy: " + kniha1.autor);
        System.out.println("Cena: " + kniha1.cena);
        System.out.println("Rok vydania: " + kniha1.rokVydania);

        System.out.println();//prázdny riadok

        //vytvorenie druhej knihy
        Kniha kniha2 = new Kniha(); //vytvorili sme další objekt knihy
        kniha2.nazov = "Já, robot";
        kniha2.autor = "Isaac Asimov";

        // ako vypísať obsah kniha2
        System.out.println("Názov knihy: " + kniha2.nazov);
        System.out.println("Autor knihy: " + kniha2.autor);

        //knihy uložíme do ArrayList-u
        ArrayList<Kniha> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        System.out.println("Vypisujem zoznam všetkých kníh v ArrayList-e: ");
        //vypísanie obsahu kníh
        System.out.println(knihy); // vypíse pre cloveka nezrozumitelný text ako napr. [oop.enkapsulacia.Kniha@b4c966a, oop.enkapsulacia.Kniha@2f4d3709]
        for (Kniha knihaObjekt:knihy){
            //System.out.println(knihaObjekt); // vypíse pre človeka nezrozumitelný text ako napr. oop.enkapsulacia.Kniha@b4c966a a oop.enkapsulacia.Kniha@2f4d3709
            System.out.println(); //prázdny riadok
            System.out.println("Názov knihy: " + knihaObjekt.nazov);
            System.out.println("Autor knihy: " + knihaObjekt.autor);
            System.out.println("Cena knihy: " + knihaObjekt.cena);
            System.out.println("Rok vydania knihy: " + knihaObjekt.rokVydania);
        }
    }
}
