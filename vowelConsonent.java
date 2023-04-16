//Q.7 WAP to check character is Vowels or Consonents. 

import java.util.Scanner;
class vowelConsonent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        char ch = sc.next().charAt(0);   // 0 indicate it will return charcter at 0 position.


       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
       {
         System.out.print(ch + "is Vowel");
       }
       else{
        System.out.print(ch + " is Consonents");
       }

       
    }
}