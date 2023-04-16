
// Q.11 WAP to find Greatest Of 3 numbers

import java.util.Scanner;
class GreatestOf3No
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int n1 = sc.nextInt();   
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();   

        if(n1 > n2 && n1 > n3)
        {
            System.out.print(n1 + " is Greatest Number.");
        }
        else if(n2 > n1 && n2 > n3){
            System.out.print(n2 + " is Greatest Number.");
        }
        else{
            System.out.print(n3 + " is Greatest Number.");
        }
       
       
    }
}