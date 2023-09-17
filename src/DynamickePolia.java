import java.util.ArrayList;
import java.util.Collections;


public class DynamickePolia {
    public static void main(String[] args) {
        ArrayList<String> auta = new ArrayList<String>();
        auta.add("Volvo");
        auta.add("BMW");
        auta.add("Ford");
        auta.add("Mazda");
        auta.add("Škoda");

        // vypis prvej položky (čite je to v podstate index 0)
        System.out.println(auta.get(0));

        //zmena značky prveho auta na Opel
        auta.set(0, "Opel");
        // vypis prvej položky (čite je to v podstate index 0)
        System.out.println(auta.get(0));

        //odstránenie prvej polozky dynamického pola
        auta.remove(0);

        //odstránenie všetkých položiek v ArrayList
       // auta.clear();

        System.out.println("Veľkosť poľa je:" + auta.size());

        System.out.println("\nVypíš všetky autá cez for-each:");
//        System.out.println(auta);
        for (String konkretneAuto:auta){  //foreach a vystup môžeme aj cez printf
            System.out.print(konkretneAuto + " ");
        }

        System.out.println(); // prázdny riadok

        System.out.println("\nVypíš všetky autá cez for:");
        for (int i = 0; i < auta.size() ; i++) {
            System.out.println(auta.get(i) + "\t");
        }

        ArrayList <Integer> dynamickePoleCisiel = new ArrayList<>();
        dynamickePoleCisiel.add(20);
        dynamickePoleCisiel.add(4);
        dynamickePoleCisiel.add(5);

        System.out.println("\nVypíš všetky celé čísla:");
        for (Integer konkretneCislo:dynamickePoleCisiel)
            System.out.println(konkretneCislo);


        Collections.sort(dynamickePoleCisiel);
        System.out.println(dynamickePoleCisiel);
    }
}
