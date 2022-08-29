package Lab2;
public class fibonacci {
    public static void main(String[] args){
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        for(int i = 3; i < fib.length; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
    }
}
