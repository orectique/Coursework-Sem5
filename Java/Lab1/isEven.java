package Lab1;
import java.util.Scanner;

public class isEven {
    public static void main (String[] args){
        try(Scanner input = new Scanner(System.in)){
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Number is even.");
            }
            else {
                System.out.println("Number is odd.");
            }
        }
    }
}
