/*1.    Write a Java program to print the prime numbers between 1 to 100.*/

package Lab4;

public class prime {
    public static void main(String[] args ){
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
    
}
