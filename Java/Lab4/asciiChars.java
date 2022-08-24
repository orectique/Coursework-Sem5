/*2.    Write a Java program to accept the strings from the user and print the ascii value of the individual character in the string.*/

package Lab4;

import java.util.Scanner;

public class asciiChars {
    public static void main(String[] args ){
        try (Scanner input = new Scanner(System.in)) {
            String str = input.nextLine();
            
            for (int i = 0; i < str.length(); i++) {
                System.out.println((int) str.charAt(i));
            }
        }
    }
    
}
