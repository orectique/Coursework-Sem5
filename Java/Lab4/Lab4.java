package Lab4;

import java.util.Scanner;
import java.util.Arrays;

public class Lab4 {

    /*1.    Write a Java program to print the prime numbers between 1 to 100.*/

    static void prime() {
        for (int i = 2; i <= 100; i++) {
            boolean prime = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }

    /*2.  Write a Java program to accept the strings from the user and print the ascii value of the individual character in the string.*/

    static void asciiChars() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input: ");
            String str = input.nextLine();
            
            for (int i = 0; i < str.length(); i++) {
                System.out.println((int) str.charAt(i));
            }
        }
    }

    /*3.  Write a Java program to find the maximum and minimum element in an array.*/

    static void minMax() {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter the number of elements in the array: ");
            int len = input.nextInt();

            System.out.println("Enter the elements of the array: ");

            int[] arr = new int[len];
            
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < len; i++) {
                arr[i] = input.nextInt();

                if (arr[i] < min) {
                    min = arr[i];
                }

                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println(Arrays.toString(arr));
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }    

    /*4.  Write a Java program to transform a given integer to String format.*/

    static void numString() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input: ");
            int num = input.nextInt();

            System.out.println("Output: ");
            System.out.println(String.valueOf(num));
        }
    }

    /*5.  Write a Java program to find a substring inside a string (Both accepted from the user as input).*/

    static void checkSubstring() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter string: ");
            String str = input.nextLine();
            System.out.println("Enter substring: ");
            String sub = input.nextLine();

            System.out.println("Substring in string: " + str.contains(sub));
        }
    }

    public static void main(String[] args) {
        System.out.println("Lab 3");
        System.out.println("1.    Write a Java program to print the prime numbers between 1 to 100.");
        prime();
        System.out.println("2.  Write a Java program to accept the strings from the user and print the ascii value of the individual character in the string.");
        asciiChars();
        System.out.println("3.  Write a Java program to find the maximum and minimum element in an array.");
        minMax();
        System.out.println("4.  Write a Java program to transform a given integer to String format.");
        numString();
        System.out.println("5.  Write a Java program to find a substring inside a string (Both accepted from the user as input).");
        checkSubstring();
    }
    
    
}
