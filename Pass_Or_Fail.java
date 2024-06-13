import java.util.Scanner;
public class PassOfFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark : ");
        int mark = sc.nextInt();
        if (mark>=40 && 100 >= mark){
            System.out.println("pass");
        }
        else if (mark>100){
            System.out.println("Wrong output");
        }
        else {
            System.out.println("Fail");
        }
    }
}
