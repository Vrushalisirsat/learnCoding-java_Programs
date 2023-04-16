// Q.13 WAP to count Digits in a number.
// Example : n = 0170 ===> digits = 4

import java.util.Scanner;
class countDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and power of number : ");
        int n = sc.nextInt();   
          
       int count = 0;
    
       while(n > 0)
       {
        count += 1;
        n = n/10; 
       }
       System.out.print("Number Of Digits = " + count);
       
    }
}