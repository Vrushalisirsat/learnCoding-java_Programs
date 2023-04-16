//Q.16 WAP to print Area Of Circle & Perimeter Of Circle.

import java.util.Scanner;
class Circle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle : ");
        int radius = sc.nextInt();
        
       double Perimeter = 2*3.14*radius;
       double Area = 3.14*radius*radius;
       System.out.println("Area Of Circle : " + Area);
       System.out.println("Perimeter Of Circle : " + Perimeter);

    }
}

