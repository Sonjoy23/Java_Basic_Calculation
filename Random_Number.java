
import java.util.Scanner;
public class Random_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;

       do{
           System.out.println("Guess my number (1-100):");
           usernumber = sc.nextInt();

           if (usernumber == mynumber){
               System.out.println("Correct Number ");
               System.out.println("Congratulation");
           }
           else if (usernumber > mynumber){
               System.out.println("Your number is too large");
               System.out.println("Sorry, Random number is: "+mynumber);
           }
           else {
               System.out.println("Your number is too small");
               System.out.println("Sorry, Random number is: "+mynumber);
           }
       } while ( usernumber >= 0);
        System.out.print("my number was :");
        System.out.println(mynumber);
    }


}