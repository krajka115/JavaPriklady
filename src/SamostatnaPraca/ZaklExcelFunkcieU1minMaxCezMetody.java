package SamostatnaPraca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZaklExcelFunkcieU1minMaxCezMetody {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

            int min = Collections.min(numbers);
            int max = Collections.max(numbers);

            System.out.println("Najnižšia hodnota: " + min);
            System.out.println("Najvyššia hodnota: " + max);
        }
    }

