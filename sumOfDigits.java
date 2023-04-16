// Q.25 WAP to reverse a number.
// n=123 --> (1+2+3)=6

import java.util.*;
class sumOfDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  
        int sum=0;
       System.out.print("Sum Of Digits is : ");
       while(n > 0)
       {
         int rem = n%10;
         sum += rem;
         n = n/ 10;
       }
       System.out.print(sum);
    }
}