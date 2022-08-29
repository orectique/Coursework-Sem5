/*4.	Write a Java program to check if the user specified string is equal to a string stored in a variable using the String library function. */

package Lab3;
import java.util.Scanner;

public class stringComp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str1 = input.nextLine();
            String str2 = input.nextLine();      

            System.out.print(str1.equals(str2));
        }
    }
}
