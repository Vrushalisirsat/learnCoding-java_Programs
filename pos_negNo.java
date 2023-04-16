// Q. 21 WAP to check number is positive or negative.

import java.util.*;
class pos_negNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();   
       
        if(n >= 0)
        {
            System.out.print(n + " is Positive Number..");
        }
        else{
            System.out.print(n + " is Negative Number..");
        }

        
    }
}