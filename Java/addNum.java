import java.util.Scanner;

public class addNum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numA = input.nextInt();
            int numB = input.nextInt();
            
            System.out.print(numA*numB);
        }
    }
}
