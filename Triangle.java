import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value a:");
            int a = sc.nextInt();
            System.out.print("Enter the value b:");
            int b = sc.nextInt();
            System.out.print("Enter the value c:");
            int c = sc.nextInt();
            if(a+b>c && b+c>a && c+a>b){
                double s = (a+b+c)/2;
                double triangle = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("Area of this triangle: "+triangle);
            }
            else{
                System.out.println("Area of this triangle not possible");
            }

        }
    }
}