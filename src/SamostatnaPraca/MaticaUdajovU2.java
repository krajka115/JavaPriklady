package SamostatnaPraca;

public class MaticaUdajovU2 {
    public static void main(String[] args) {
        int riadky = 5;
        int stlpce = 5;
        int hodnota = 1; //začiatočná hodnota

        int [][] matica = new int[riadky][stlpce];

        for (int i = 0; i < riadky; i++ ) {
            for (int j = 0; j < stlpce; j++) {
                matica [i][j] = hodnota;
                hodnota *=2;
            }

        }
        for (int i = 0; i < riadky; i++) {
            for (int j = 0; j < stlpce; j++ ) {
                System.out.print(matica[i][j] + " ");;

            }
            System.out.println();
        }

    }
}
