// Q.9 WAP to find Greatest number between 2 numbers.

import java.util.Scanner;
class GreatestNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 number : ");
        int n1 = sc.nextInt();   
        int n2 = sc.nextInt();   

        if(n1 > n2)
        {
            System.out.print(n1 + " is Greatest Number.");
        }
        else{
            System.out.print(n2 + " is Greatest Number.");
        }
       
       
    }
}