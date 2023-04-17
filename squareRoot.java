// Q.28 WAP to find square root of a given number.
// input n = 25 --> 5

import java.util.*;
class squareRoot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  
        
        double squareRoot = Math.sqrt(n);
        System.out.print("Square Root Of " + n + " is " + squareRoot);
    }
}