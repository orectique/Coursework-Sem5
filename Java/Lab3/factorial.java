/*1.	Write a java program to find the factorial of a number and using recursion. */

package Lab3;
import java.util.Scanner;

public class factorial {

    static int facts(int in) {
        if (in == 1) {
            return 1;
        } else {
            return in*facts(in - 1);
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();

            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact = fact*i;
            }
            
            System.out.println(fact);

            System.out.println(facts(num));
        }
    }

    
}
