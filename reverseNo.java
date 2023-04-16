// Q.24 WAP to reverse a number.
// n=123 --> n=321
import java.util.*;
class reverseNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  

       System.out.print("Reverse Number is : ");
       while(n > 0)
       {
         int rem = n%10;
         System.out.print(rem);
         n = n/ 10;
       }
    }
}