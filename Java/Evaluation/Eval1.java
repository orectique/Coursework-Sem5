/*
1. Write a program to convert from one unit scale to another. Accepting the numeric input and the base unit from the user, get the targeted unit choice also from the user and do the conversion.(For example Enter the number: 1, Enter the unit: km, Enter the unit to be converted : Meter Output: 1000).
2. Write a program to find the cartesian product of numbers belonging to two arrays. Accept the arrays and their elements from the user. (For example, if arr1 = [1, 2, 3] and arr2 = [4, 5]; Then their cartesian product will be = [[1, 4], [1, 5], [2, 4], [2, 5], [3, 4], [3, 5]];
3. Given two complex numbers, you have to print the result of their addition, subtraction, multiplication, and modulus operation on the first complex number (Note: Modulus of a complex number is the square root of the sum of squares of real and imaginary parts) ( If the input is 2 1 5 6, the output should be 7.00 + 7.00j, -3.00-5.00j, 4.00+17.00j, 2.24+0.00j)
 */

package Evaluation;

import java.util.Scanner;
import java.lang.String;

public class Eval1 {

    public static double convert (double num, String base, String target) {
        double result = 0;
        switch (base) {
            case "m":
                switch (target) {
                    case "km":
                        result = num / 1000;
                        break;
                    case "cm":
                        result = num * 100;
                        break;
                }
            case "f":
                switch (target) {
                    case "km":
                        result = num * 3 / 10000;
                        break;
                    case "cm":
                        result = num * 3 * 100 / 10;
                        break;
                }
        }        
        
        return result;
    }

    public static int[][] cartProd (int[] arr1, int[] arr2) {
        int[][] result = new int[arr1.length * arr2.length][];

        int k = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int[]  temp = {arr1[i], arr2[j]};

                result[k] = temp;
        
                k += 1;
            }
        }
        return result;
    }

    public static double[] complexCalc(int i1, int j1, int i2, int j2) {
        double sumI = i1 + i2;
        double sumJ = j1 + j2;
    
        double diffI = i1 - i2;
        double diffJ = j1 - j2;
    
        double prodI = i1 * i2 - j1 * j2;
        double prodJ = i1 * j2 + i2 * j1;
    
        double mod1 = Math.pow(Math.pow(i1, 2) + Math.pow(j1,2), 0.5);
        double mod2 = Math.pow(Math.pow(i2, 2) + Math.pow(j2,2), 0.5);

        double[] result = {sumI, sumJ, diffI, diffJ, prodI, prodJ, mod1, mod2};
    
        return result;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity: ");
        double num = input.nextDouble();
        System.out.println("Enter base unit: ");
        String base = input.next();
        System.out.println("Enter target unit: ");
        String target = input.next();
        System.out.println("Converted: " + String.valueOf(convert(num, base, target)));

        input.close();

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter array 1 length: ");
        int arr1Len = input2.nextInt();
        int[] arr1 = new int[arr1Len];
        System.out.println("Enter array 1 elements: ");
        for (int i = 0; i < arr1Len; i++) {
            arr1[i] = input2.nextInt();       
        }

        System.out.println("Enter array 2 length: ");
        int arr2Len = input2.nextInt();
        int[] arr2 = new int[arr1Len];
        System.out.println("Enter array 2 elements: ");
        for (int i = 0; i < arr2Len; i++) {
            arr2[i] = input2.nextInt();       
        }

        int[][] out = cartProd(arr1, arr2);
        for (int[] prod : out) {
            System.out.println("[ " + String.valueOf(prod[0]) + " , " + String.valueOf(prod[1]) + " ]");
        }

        input2.close();

        Scanner input3 = new Scanner(System.in);
        
        System.out.println("Enter real coeff of num1: ");
        int i1 = input3.nextInt();

        System.out.println("Enter imaginary coeff of num1: ");
        int j1 = input3.nextInt();


        System.out.println("Enter real coeff of num2: ");
        int i2 = input3.nextInt();

        System.out.println("Enter imaginary coeff of num2: ");
        int j2 = input3.nextInt();

        double outs[] = complexCalc(i1, j1, i2, j2);

        System.out.println("Sum: " + String.valueOf(outs[0]) + " + " + String.valueOf(outs[2]) + "j");
        
        System.out.println("Difference: " + String.valueOf(outs[2]) + " + " + String.valueOf(outs[3]) + "j");
        
        System.out.println("Product: " + String.valueOf(outs[4]) + " + " + String.valueOf(outs[5]) + "j");
        
        System.out.println("Modulus 1: " + String.valueOf(outs[6]));
        System.out.println("Modulus 1: " + String.valueOf(outs[7]));   

        input3.close();

    }
}
