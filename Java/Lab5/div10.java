/*2.Have an array A of size N that contains non-negative integers. Your task is to determine whether the number that is formed by adding the last digit of all the N numbers is divisible by 10.
 */

package Lab5;

import java.util.Scanner;
import java.util.Arrays;

public class div10 {

    static int nonZero(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int len = input.nextInt();
            int[] arr = new int[len];

            while (nonZero(arr) < len) {
                int temp = input.nextInt();
                if ( temp >= 0) {
                    arr[nonZero(arr)] = temp;
                } else {
                    System.out.println("Invalid input");
                    continue;
                }
            }

            System.out.println("Entered Array: " + Arrays.toString(arr));

            int sum = 0;

            for (int i : arr) {
                sum += i % 10;
            }

            System.out.println("The sum of the last digits is divisible by 10: " + (sum % 10 == 0));

        }
    }
}
