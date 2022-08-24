/*5.  Write a Java program to find a substring inside a string (Both accepted from the user as input).*/

package Lab4;

import java.util.Scanner;

public class checkSubstring {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter string: ");
            String str = input.nextLine();
            System.out.println("Enter substring: ");
            String sub = input.nextLine();

            System.out.println("Substring in string: " + str.contains(sub));
        }
    }
}
