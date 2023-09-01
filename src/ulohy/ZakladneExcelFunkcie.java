package ulohy;

/*Úloha č. 1: Úloha na základné Excel funkcie.
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), ktorá vypočíta priemer z daných čísiel.
        Bonusové úlohy naviac: Vytvorte metódu pocet(), ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti najmenšie číslo v poli.


        */


public class ZakladneExcelFunkcie {

    public static double scitaj (double [] cisla) {
        double sum=0;

        for (int i = 0; i < cisla.length; i++) {
            //    System.out.println(cisla[i]);
            //   sum = sum + cisla[i];
            sum += cisla[i]; // identicky vyznam ako riadok vyssie
        }
        return sum;
    }

    public static void main(String[] args) {
        double [] cisla = {10, 20, 30, 40, 50}; // Vytvorenie a naplnenie pola s desatinnymi cislami

        System.out.println("Výsledok sčítania hodnôt v poli je: " + scitaj(cisla));
    }
}
// alebo a tu sa dá vytvoriť metoda na scitanie hodnot ak copy text od double cisla  po sum = sum/ refactor/extract method/pomenujem a vytvorí mi metodu
/*public class ZakladneExcelFunkcie {
    public static void main(String[] args) {
        double [] cisla = {10, 20, 30, 40, 50}; // Vytvorenie a naplnenie pola s desatinnymi cislami
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            sum = sum + cisla[i];
         }
            return sum;
        }
        System.out.println("Výsledok sčítania hodnôt v poli je: " + sum);
    }
}*/

