// Q.26 WAP to check number is palindrome or not.
// n=121  ---> 121

import java.util.*;
class palindromeNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  
        int p=n;
        int pal=0;
       
       while(n > 0)
       {
         int rem = n%10;           // rem = 121%10 = 1  , rem = 12%10 = 2  , rem = 1%10=1
         pal = (pal*10)+rem;       // pal = (0*10)+1 = 1  , pal = (1*10)+2 = 12 , pal=(12*10)+rem = 121
         n = n/ 10;                // n = 121/10 = 12  ,n=1 , n=0
       }
       if( pal == p)
       {
          System.out.print("Palindrome Number.");
       }
       else{
        System.out.print("Not a Palindrome Number.");
       }
    }
}