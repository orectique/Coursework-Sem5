/*1.	Write a Program to find if the pair of numbers entered by the user is  
“amicable”?
Steps to find amicable numbers:
1.	Read or initialize two numbers (N1, N2) from the user.
2.	Find the divisor (divOfN1, divOfN2) of both numbers.
3.	Find the sum of divisors (sumdiv1, sumdiv2) of both numbers.
4.	Check if the sum of divisors of one number is equal to the other number or not.
o	If equal, the pair of numbers is amicable.
o	Else, not amicable.
 */

package Java.Lab7;

import java.util.Scanner;

public class amicableNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int N1 = input.nextInt();

            System.out.println("Enter second number: ");
            int N2 = input.nextInt();

            int sumdiv1 = 0;
            int sumdiv2 = 0;

            for (int i = 0; i <= N1; i++) {
                if (N1%i == 0) {
                    sumdiv1 += i;
                }
            }

            for (int i = 0; i <= N2; i++) {
                if (N2%i == 0) {
                    sumdiv2 += i;
                }
            }

            if (sumdiv1 == N2 && sumdiv2 == N1) {
                System.out.println("The numbers are amicable.");
            } else {
                System.out.println("The numbers are not amicable.");
            }

        }
    }
}
