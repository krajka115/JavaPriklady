package ulohy;

public class ZaklExcelFunkcieOdJavaDeveloper {
    public static void main(String[] args) {
        double [] cisla = {10, 20, 30, 40, 50}; // Vytvorenie a naplnenie pola s desatinnymi cislami

        double sum = scitaj(cisla);
        System.out.println("Výsledok sčítania hodnôt v poli je: " + sum);

        double priemer = priemeruj(cisla);
        System.out.println("Výsledok priemerovania hodnôt v poli je: " + priemer);

        double priemerEfektivne = priemerujEfektivne(cisla);
        System.out.println("Výsledok EFEKTIVNÉHO priemerovania hodnôt v poli je: " + priemerEfektivne);


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

    // Metoda na priemerovanie hodnot v poli
    private static double priemerujEfektivne(double[] cisla) {

        return scitaj(cisla) / cisla.length;
    }

}

