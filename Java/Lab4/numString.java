/*4.  Write a Java program to transform a given integer to String format.*/

package Lab4;

import java.util.Scanner;

public class numString {
    public static void main(String[] args ){
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();

            System.out.println(String.valueOf(num));
        }
    }
    
}
