// Q.27 WAP to check number is armstrong or not.
// n=153 ---> (1*1*1 + 5*5*5 + 3*3*3) = 153

import java.util.*;
class armstrongNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  
        int a=n;
        int arm=0;
       
       while(n > 0)
       {
         int rem = n%10;           // rem = 153%10 = 1  , rem = 15%10 = 5  , rem = 1%10=1
         arm += (rem*rem*rem);       // arm += (3*3*3) = 27  , arm += (5*5*5) = 152 , arm += (1*1*1) = 153
         n = n/ 10;                // n = 153/10 = 15  ,n=1 , n=0
       }
       if( arm == a)
       {
          System.out.print("Armstrong Number.");
       }
       else{
        System.out.print("Not a Armstrong Number.");
       }
    }
}