import java.util.Scanner;
public class Diagonal_Equation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number A:");
        double a = sc.nextDouble();
        System.out.print("Enter The Number B:");
        double b = sc.nextDouble();
        System.out.print("Enter The Number C:");
        double c = sc.nextDouble();
        double d = (b*b)-(4*a*c);
        if(d>0){
            double x1 = (-b+Math.sqrt(d)/(2*a));
            double x2 = (-b-Math.sqrt(d)/(2*a));
            System.out.println("the x1 are"+x1);
            System.out.println("The x2 are"+x2);

        } else if (d==0) {
            double x=((-b)/(2*a));
            System.out.println("The x are"+x);
        } else{
            System.out.println("Roots are not possible");
        }




    }
}