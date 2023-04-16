// Q.1 WAP to check number is odd or even.

import java.util.Scanner;
class odd_Even_No
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n%2 == 0)
        {
            System.out.println(n + " is Even Number");
        }
        else{
            System.out.println(n + " is Odd Number");
        }
    }
}