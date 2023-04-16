//Q.15 WAP to print Area Of Rectangle & Perimeter Of Rectangle.

import java.util.Scanner;
class Rectangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of rectangle : ");
        int l = sc.nextInt();
        int w = sc.nextInt();   
          
       int Area = l*w;
       int Perimeter = 2*(l+w);
       System.out.println("Area Of Rectangle : " + Area);
       System.out.println("Perimeter Of Rectangle : " + Perimeter);

    }
}