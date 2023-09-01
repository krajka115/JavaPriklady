package SamostatnaPraca;

public class MaticaUdajovU1 {
    /*public static void main(String[] args) {
        int rows = 5; // Počet riadkov
        int cols = 5; // Počet stĺpcov
        int value = 1; // Počiatočná hodnota

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
        // Výpis matice
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        double value = 1.0; // Začiatočná hodnota

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value;
                value += 0.1; // Zvýšenie hodnoty o 0,1
            }
        }

        // Výpis matice ak chcem aby zaokrúhlilo na 1desatinné miesto, inak použijem len print
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf( "%.1f ", matrix[i][j] );
            }
            System.out.println();
        }
    }
}
