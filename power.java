// Q.10 WAP to calculate power of a number.

import java.util.Scanner;
class power
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and power of number : ");
        int n = sc.nextInt();   
        int p = sc.nextInt();   

       int power = 1;
       for(int i=0;i<p;i++)
       {
        power *= n;
       }
        System.out.print("Power Of " + n + " to the power " + p + " is " + power);
       
    }
}