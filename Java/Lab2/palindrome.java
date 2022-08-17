/*3.	Write a java program to check if the given integer number is a palindrome */

package Lab2;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            int rev = 0;

            boolean out = true;

            int temp = num;

            while (num > 0) {
                int rem = num % 10;
                rev = rev*10 + rem;
                num = num / 10;
            }

            if (temp != rev) {
                out = false;
            }

            System.out.print(out);
        }
    }
    
}
