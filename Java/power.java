import java.util.Scanner;
import java.lang.Math;

public class power {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numA = input.nextInt();
            int numB = input.nextInt();
            
            System.out.print(Math.pow(numA, numB));
        }
    }
}
