//Q.5 WAP to print sum of Odd or Even Numbers.

import java.util.Scanner;
class sumOf_ODD_EVENno
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
         if(n%2 == 0)
         {
            for(int i=0;i<=n;i=i+2)
            {
                sum += i;
            }
            System.out.print("Sum Of Even Number = " + sum);
         }
         else{
             for(int i=1;i<=n;i=i+2)
            {
                sum += i;
            }
            System.out.print("Sum Of Odd Number = " + sum);
         }
        
       
    }
}