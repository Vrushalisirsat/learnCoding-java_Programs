//Q.30 WAP to check wheather a number is perfect or not.
// n=6 --> 1 2 3 4 5 (less than 6 number)
// 6 ---> 1 2 3 (those no. which is divisible by 6 in above less than 6 number)
// now ,if addition of that number is exactly equall to original number then this number is called as perfect number.
// 1+2+3 = 6 ~ n=6  ----> hence, 6 is perfect number.

import java.util.*;
class perfectNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  
        
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i == 0)
            {
                sum += i;
            }
        }

        if(sum == n)
        System.out.print(n + " is perfect number.");
        else
        System.out.print(n + " is not a perfect number.");
    }
}