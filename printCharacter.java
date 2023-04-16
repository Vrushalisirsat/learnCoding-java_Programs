//Q.6 WAP to take chracter input from user and print it.

import java.util.Scanner;
class printCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        char ch = sc.next().charAt(0);   // 0 indicate it will return charcter at 0 position.

       System.out.print(ch);
       
    }
}