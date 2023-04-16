//Q. WAP to print ASCII value of a character.

import java.util.Scanner;
class printASCIIvalue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = sc.next().charAt(0);   // 0 indicate it will return charcter at 0 position.

      int a = ch;
       System.out.print("ASCII value of " + ch + " is " + a);
       
    }
}