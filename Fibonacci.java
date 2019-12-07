import java.util.*;

public class Fibonacci{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(fib(num));
        scan.close();
    }

    public int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1) + fib(n-2);
    }
}
