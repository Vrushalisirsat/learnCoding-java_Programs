// Q.20 WAP to convert character uppercase to lowercase and vice-versa.
// input - a to z ---convert---> Uppercase
// input - A to Z ---convert---> Lowercase

import java.util.*;
class convertLower_Upper
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entera any chracter : ");
        char ch = sc.next().charAt(0);    
         char ch2;
        if(ch >= 'A' && ch <= 'Z')
        {
            ch2 = Character.toLowerCase(ch);
            System.out.println("LowerCase = " + ch2);
        }
        else{
             ch2 = Character.toUpperCase(ch);
            System.out.println("UpperCase = " + ch2);
        }
        
    }
}