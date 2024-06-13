import java.util.*;
public class Reverse_Digite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your long number:");
        long tamp= sc.nextInt();
        long sum =0;
        while(tamp!=0){
            long ModulNum=tamp%10;
            //jodi sum=sum+modulnum korle sob digit alada hoye add hobe
            // sum=sum*10+ModulNum korea jono sonkha gulu reverce holo
            sum = sum*10+ ModulNum;
            tamp = tamp/10;

        }
        System.out.println(sum);
    }
}