//Q.17 WAP to print Area Of square & Perimeter Of square.

import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square : ");
        int side = sc.nextInt();  
          
       int Area = side*side;
       int Perimeter = 4*side;
       System.out.println("Area Of Rectangle : " + Area);
       System.out.println("Perimeter Of Rectangle : " + Perimeter);

    }
}