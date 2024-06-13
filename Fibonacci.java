import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Range:");
        int n=sc.nextInt();
        long fast=0;
        long second=1;
        long fibo;
        //1st & 2nd number print 
        System.out.print(fast+" "+second);
        for(long i=3; i<=n; i++){
            //tin theke number count suro hoyce
            fibo = fast+second;
            System.out.print(" "+fibo);
            // number poriborton
            fast=second;
            second=fibo;
        }


    }
}