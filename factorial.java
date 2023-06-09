// Q.12 WAP to find factorial of number.
// Example : 5! = 5*4*3*2*1.
/*
import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial : ");
        int n = sc.nextInt();   
          

       int fact = 1;
       for(int i=1;i<=n;i++)
       {
        fact *= i; 
       }
        System.out.print("Factorial Of " + n + " is " + fact);
       
    }
}
*/

//-----------------------------------------------------------------------------------------------
// Q.12 WAP to find factorial of number using recursion.
// Example : 5! = 5*4*3*2*1.

import java.util.Scanner;
class factorial
{
    static int printfactorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n*printfactorial(n-1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial : ");
        int n = sc.nextInt();   
        
        System.out.print("Factorial Of " + n + " is " + printfactorial(n));
       
    }
}