package ulohy.oop.enkapsulacia;

/*
Úloha č. 1
        Vytvorte zoznam zamestnancov (DatabazaZamestnancov) v ktorej uložíme zamestnancov s údajmi ako je meno, priezvisko, pohlavie a rok narodenia. Využijeme princípy zapúzdrenia (encapsulation), čiže tvorba modelu a použitie getterov a setterov. Uloženie do dynamického poľa (čiže ArrayList-u) a následné vypísanie.
        */

import oop.enkapsulacia.KnihaSpravne;

import java.util.ArrayList;

public class DatabazaZamestnancovMain {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Jaroslav");
        zamestnanec1.setPriezvisko("Klikáč");
        zamestnanec1.setPohlavie("muž");
        zamestnanec1.setRokNarodenia(1984);

        System.out.println("Zamestnanec č.1: ");
        System.out.println("________________");
        System.out.println("Meno: " + zamestnanec1.getMeno());
        System.out.println("Priezvisko: " + zamestnanec1.getPriezvisko());
        System.out.println("Pohlavie: " + zamestnanec1.getPohlavie());
        System.out.println("Rok narodenia: " + zamestnanec1.getRokNarodenia());

        Zamestnanec zamestnanec2 = new Zamestnanec();
        zamestnanec2.setMeno("Katarína");
        zamestnanec2.setPriezvisko("Krajčiová");
        zamestnanec2.setPohlavie("žena");
        zamestnanec2.setRokNarodenia(1987);

        System.out.println("\nZamestnanec č.2: ");
        System.out.println("----------------");
        System.out.println(zamestnanec2);

        ArrayList<Zamestnanec> zamestnanci = new ArrayList<>();
        zamestnanci.add(zamestnanec1);
        zamestnanci.add(zamestnanec2);


        System.out.println("\n\nVypíš všetkých zamestnancov: ");
        System.out.println("----------------------------");
        for (Zamestnanec DatabazaZamestnancovMain : zamestnanci) {
            System.out.println(); //prázdny riadok
            System.out.println(DatabazaZamestnancovMain);


        }
    }
}
