import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class ZaklFunkcieCezSkener {

    /*
    excel
     */

        public static void main(String[] args) {
            var s = new Scanner(System.in);
            System.out.println("Zadaj čísla oddelené medzerou:");
            String cisla = s.nextLine();
            if (cisla.length() == 0) System.exit(1);
            s.close();

            String[] cislaVpoli = cisla.split(" ");
            int[] nums = new int[cislaVpoli.length];
            for (int i = 0; i < cislaVpoli.length; i++) {
                nums[i] = Integer.parseInt(cislaVpoli[i]);
            }

            System.out.println("Suma čísiel je: " + getSum(nums));
            System.out.println("Počet čísiel v poli je: " + count(nums));
            System.out.println("Priemer je: " + getAverage(nums));
            System.out.println("Maximum je: " + getMax(nums));
            System.out.println("Minumum je: " + getMin(nums));
        }

        private static int count(int[] nums) {
            return nums.length;
        }

        private static int getMax(int[] nums) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        private static int getMin(int[] nums) {
            OptionalInt num = Arrays.stream(nums).min();
            if (num.isPresent()) return num.getAsInt();
            return 0;
        }

        private static float getAverage(int[] nums) {
            return (float) getSum(nums) / count(nums);
        }

        private static int getSum(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return sum;
        }
    }

