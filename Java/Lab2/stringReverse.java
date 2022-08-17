/*5.Write a Java Program to reverse a string with and without using the library function */

package Lab2;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.nextLine();

            String rev1 = "";

            for (int i = 0; i < str.length(); i++) {
                rev1 = str.charAt(i) + rev1;
            }
            
            System.out.println(rev1);

            StringBuilder strBuil = new StringBuilder();

            strBuil.append(str);

            strBuil.reverse();

            System.out.println(strBuil);

        }
    }
}
