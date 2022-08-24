/*3.  Write a Java program to find the maximum and minimum element in an array.*/

package Lab4;

import java.util.Scanner;
import java.util.Arrays;

public class minMax {
    public static void main(String[] args ){
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter the number of elements in the array: ");
            int len = input.nextInt();

            System.out.println("Enter the elements of the array: ");

            int[] arr = new int[len];
            
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < len; i++) {
                arr[i] = input.nextInt();

                if (arr[i] < min) {
                    min = arr[i];
                }

                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println(Arrays.toString(arr));
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);


        }
    }
}
