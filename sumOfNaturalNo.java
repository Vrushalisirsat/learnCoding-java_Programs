// Q.2 WAP to print first N natural numbers.

/*
import java.util.Scanner;
class sumOfNaturalNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

       System.out.print("First "+ n + " natural Number is : ");
       for(int i=1;i<=n;i++)
       {
        System.out.print(i + " ");
       }
    }
}
*/

//----------------------------------------------------------------------------------------------------------------------------------------

//Q.2 WAP to print the sum of first N natural number in java.

import java.util.Scanner;
class sumOfNaturalNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

       int sum = 0;
       for(int i=1;i<=n;i++)
       {
        sum += i; 
       }
       System.out.print("Sum of first " + n + " natural number is : " + sum);
    }
}
