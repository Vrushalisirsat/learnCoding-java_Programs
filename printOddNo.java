//Q.3 WAP to print all odd number from 1 to N .

import java.util.Scanner;
class printOddNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

       System.out.print("first " + n + " Odd Number is : ");
       for(int i=1;i<=n;i++)
       {
         if(i%2 != 0)
         {
            System.out.print(i + " ");
         }
       }
       
    }
}