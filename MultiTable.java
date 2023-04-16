// Q.14 WAP to print Multiplication Table.

import java.util.Scanner;
class MultiTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();   
          
       System.out.println("Table Of " + n + " is " );
       for(int i=1;i<=10;i++)
       {
         int  Multiplication = n * i;
         System.out.println(n + " * " + i + " = " + Multiplication);
       }
      
       
    }
}