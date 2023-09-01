public class Polia {
    public static void main(String[] args) {
        // Deklaracia pola s nazvom znackyAut, ktore obsahuej 4 znacky
        String[] znackyAut = {"Volvo", "BMW", "Ford", "Mazda"};

        // Vypis prvu znacku
        System.out.println(znackyAut[0]);

        // Vypis poslednu znacku
        System.out.println(znackyAut[3]);

       // zmena znacky prveho auta
        znackyAut[0] = "Opel";

        // A vypis tuto zmenu
        System.out.println(znackyAut[0]);

        // Pocet vsetkych znaciek aut v poli je
        System.out.println(znackyAut.length);

        // Vypis vsetky znacky aut v poli
        System.out.println("Vypíše všetky značky áut:");
        System.out.println("-------------------------");
        // pouzijeme cyklus s pevnym poctom opakovani a prikazu length, ktory zistuje dlzku pola
        for (int i = 0; i < znackyAut.length; i++) {
            System.out.println(znackyAut[i]);
            // mozeme v cykle vykonat aj viacero prikazov
        }
        System.out.println();
        // vypis vsetky znacky aut v poli cez foreach
        System.out.println("Vypíše všetky značky áut cez foreach: ");
        System.out.println("......................................");
        for (String konkretnaZnacka: znackyAut) {
            System.out.println(konkretnaZnacka);
        }
    }
}
