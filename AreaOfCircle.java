package Mathematics;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter the radius:");
        final double pi=3.1416;
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double area=pi*(r*r);
        System.out.println("Area of circle is:"+area);

    }
}
