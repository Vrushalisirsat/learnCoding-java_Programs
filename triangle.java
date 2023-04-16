//Q.18 WAP to print Area Of Traingle & Perimeter Of Triangle.

import java.util.Scanner;
class triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height and base of Triangle : ");
        int h = sc.nextInt();
        int b = sc.nextInt();   
          
       double Area = (h*b)/2;
       System.out.println("Area Of Rectangle : " + Area);
     
       System.out.print("Enter side and base of Triangle : ");
       int side = sc.nextInt();
       int base = sc.nextInt(); 
       double Perimeter = side+base+side;
       System.out.println("Perimeter Of Triangle : " + Perimeter);
    }
}