/*3.Write a program to display the GCD of the given two integers and both the input has to be accepted from the user
 */

package Lab5;

import java.util.Scanner;
import java.lang.Math;

public class gcd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = input.nextInt();

            int gcd = 1;

            for (int i = 1; i <= Math.min(num1, num2); i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }

            System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

        }
    }
}
