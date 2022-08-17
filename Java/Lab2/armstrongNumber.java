/*2.	Write a java program to check if a given number is an Armstrong number.*/

package Lab2;
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();

            boolean out = true;

            int sum = 0;
            int digit;
            int temp = num;

            while (num > 0) {
                
                digit = num % 10;
                sum += digit*digit*digit;

                num = Math.floorDiv(num, 10);
            }

            if (temp != sum) {
                out = false;
            }

            System.out.print(out);
        }
    }

    
}

