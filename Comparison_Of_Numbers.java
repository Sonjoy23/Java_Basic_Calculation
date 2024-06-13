import java.util.Scanner;
public class Comparison_Of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Fast Number:");
        int a = sc.nextInt();
        System.out.print("Enter your second number:");
        int b = sc.nextInt();
        if(a<b){
            System.out.println("your small number is Fast");
        }
        else{
            System.out.println("Your small Number is second ");
        }
    }
}