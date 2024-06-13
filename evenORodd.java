import java.util.Scanner;
public class evenORodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number:");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("The number is odd");
        }
        else {
            System.out.println("the number is even");
        }

    }
}