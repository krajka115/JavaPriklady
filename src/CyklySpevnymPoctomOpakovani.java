public class CyklySpevnymPoctomOpakovani {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        System.out.println(); // prazdny riadok
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println(); // prazdny riadok
        // vypis parne cisla, môzeme pouzit zapis scitania i=i+2, resp.i+=2
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.print(i);

        }
        // vypis parne cisla odzadu
        System.out.println(); // prazdny riadok
        for (int i = 10; i >= 2; i = i - 2) {
            System.out.print(i + "\t"); // pouzil som \t ako tabulátor, aby som odsadil vypis hodnoty
        }

        System.out.println(); // prazdny riadok
        // vnaranie cyklov
        // TODO ako vypisat hodnoty od 1 do 100, aby v prvom riadku vypísalo od 1 do 10, druhom od 11 do 20.... atd.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((j * i) + "\t");
            }}

            System.out.println(); // prazdny riadok
        for (int i = 1; i <= 10; i++) {
            for (int j = i + 1; j <= 10; j++) {
                System.out.print((j * i) + "\t");
            }
        }
// TODO Ako vypisat hodnoty od 1 do 100, aby v prvom riadku vypisalo od 1 do 10, v druhom od 11 do 20, v tretom od 21 do 30, atd.
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + "\t");
                if (i % 10 == 0) System.out.println();
            }

            //Beluský Martin 18:59
        System.out.println(); // prazdny riadok
            int k = 0;
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10 ; j++) {
                    System.out.print(++k + "\t");
                }
                System.out.println();
            }
        // TODO Ako vypisat hodnoty od 1 do 100, aby v prvom riadku vypisalo od 1 do 10, v druhom od 11 do 20, v tretom od 21 do 30, atd.
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) System.out.println();
        }

        System.out.println("\nPodobná úloha ako vyššie s využitim 2 cyklov, resp. vnoreného");
        // Podobna uloha ako vyssie s vyuzitim 2 cyklov, resp. vnoreneho
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((10 * i + j) + "\t");
            }
            System.out.println();
        }


            }
        }

