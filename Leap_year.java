import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        while (true) {

            System.out.print("Enter the year:");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            if ((year%400==0) || (year%4==0 && year%100!=0)){
                System.out.println("Happy leap year "+year);
            }
            else{
                System.out.println("this year not leap year");
            }

        }
    }
}