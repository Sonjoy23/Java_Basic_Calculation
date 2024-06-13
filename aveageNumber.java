import java.util.*;
public class aveageNumber {
    public static void main(String[] args) {
        double count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range number:");
        int m=sc.nextInt();
        for(int j=1; j<=m; j++){
            System.out.print("Number "+j+": ");
            int n =sc.nextInt();
            count = n+count;
        }
        System.out.println("the average number is:"+count/m);
    }
}