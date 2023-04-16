//Q.4 WAP to print all Even number from 0 to N .

import java.util.Scanner;
class printEvenNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

       System.out.print("first " + n + " Even Number is : ");
       for(int i=0;i<=n;i++)
       {
         if(i%2 == 0)
         {
            System.out.print(i + " ");
         }
       }
       
    }
}