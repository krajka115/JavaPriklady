package ulohy.oop.enkapsulacia;

import java.util.ArrayList;

public class EvidenciaVozidielMain {
    public static void main(String[] args) {
            Auto auto1 = new Auto();
            auto1.setZnacka("Volvo");
            auto1.setFarba("modrá");
            auto1.setRokVyroby(1998);

            Auto auto2 = new Auto();
            auto2.setZnacka("Audi");
            auto2.setFarba("čierna");
            auto2.setRokVyroby(1976);

            Auto auto3 = new Auto("Toyota", "biela", 2020); // jednoduchší výpis vďaka vytvorenému stringu v triede Auto
            Auto auto4 = new Auto("Opel", "červená", 1969);



            ArrayList<Auto> vypisZnacky = new ArrayList<>();
            vypisZnacky.add(auto1);
            vypisZnacky.add(auto2);
            vypisZnacky.add(auto3);
            vypisZnacky.add(auto4);

            System.out.println("V súčasnosti sa v našej evidencii áut nachádzajú tieto vozidlá: ");
            System.out.println("---------------------------------------------------------------");
            for (Auto EvidenciaVozidielMain : vypisZnacky) {
                System.out.println(EvidenciaVozidielMain);
            }
            /*String vypisZnacku = ("\n\n\nVýpis z evidencie vozidiel pomocou metódy vypisZnacku: " + "\n" + auto1.vypisZnackuMetoda() + "\n" + auto2.vypisZnackuMetoda() + "\n" + auto3.vypisZnackuMetoda() + "\n" + auto4.vypisZnackuMetoda());*/
            System.out.println("\n\n\nVýpis z evidencie vozidiel pomocou metódy vypisZnacku: " + "\n" + auto1.vypisZnackuMetoda() + "\n" + auto2.vypisZnackuMetoda() + "\n" + auto3.vypisZnackuMetoda() + "\n" + auto4.vypisZnackuMetoda());
    }
}