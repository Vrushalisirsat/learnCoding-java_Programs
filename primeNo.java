// Q.29 WAP to check number is prime Number.
// prime number : number which is divisible by 1 and itself called as prime number.
//eg :- 1,3,5,7,11,13 ---> prime number

import java.util.*;
class primeNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  
        
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        System.out.print(n + " is prime number.");
        else
        System.out.print(n + " is not a prime number.");
    }
}