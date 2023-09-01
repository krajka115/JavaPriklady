package SamostatnaPraca;

public class ZaklExcelFunkcieU1 {
    public static double scitaj ( double [] cisla) {
        double sum =0;
        for (int i = 0; i < cisla.length; i++) {
        sum += cisla[i];
        } return sum;
    }
 public static double priemer ( double [] cisla ) {
        double priemer =0;
     for (int i = 0; i < cisla.length; i++) {
        priemer += cisla[i] / cisla.length;
     } return  priemer;
 }
    // TODO Vytvor metodu s nazvom pocet na zistenie poctu vstupnych hodnot (pola)
    // TODO Vytvor metodu s nazvom max na ziskanie najvyssej hodnoty
    // TODO Vytvor metodu s nazvom min na ziskanie najnizsej hodnoty
    public static double pocetCisel ( double [] cisla ) {
        double pocetCisel =0;
        for (int i = 0; i < cisla.length; i++) {
            pocetCisel =  cisla.length;
        } return pocetCisel;
    }






    public static void main(String[] args) {
        double [] cisla = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       /* double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            sum = sum + cisla[i];*/ //a
        double minimalnaHodnota = getMinimalnaHodnota(cisla);

        double maximalnaHodnota = cisla [0];
        for (int i = 0; i < cisla.length ; i++) {
            maximalnaHodnota = Math.max(maximalnaHodnota, cisla[i]);
        }

        System.out.println(" Výsledok sčítania hodnôt pomocov metódy je: " + scitaj(cisla));
        System.out.println(" Výsledok priemeru hodnôt pomocov metódy je: " + priemer(cisla));
        System.out.println(" Počet čísel v poli je: " + pocetCisel(cisla));
        System.out.println(" Minimálna hodnota z čísel v poli pomocou metódy je: " + minimalnaHodnota);
        System.out.println(" Maximálna hodnota z čísel v poli je: " + maximalnaHodnota);
    }


    private static double getMinimalnaHodnota(double[] cisla) {
        double minimalnaHodnota = cisla[0];
        for (int i = 0; i < cisla.length ; i++) {
            minimalnaHodnota = Math.min(minimalnaHodnota, cisla[i]);

        }
        return minimalnaHodnota;
    }
    /* System.out.println("Výsledok sčítania hodnôt v poli je: " + sum);*/ //a
}





