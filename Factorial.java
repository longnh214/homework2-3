import java.util.*;

public class Factorial{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int output=1;
        for(int i=1;i<=num;i++){
            output *= i;
        }
        System.out.println(output);
    }
}
