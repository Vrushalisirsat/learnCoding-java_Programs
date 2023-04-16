// Q.12 WAP to calculate Total and Average marks of 5 subjects.

import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 subjects Marks : ");
        int n1 = sc.nextInt();   
        int n2 = sc.nextInt();
        int n3 = sc.nextInt(); 
        int n4 = sc.nextInt(); 
        int n5 = sc.nextInt();   

        double Average = (n1+n2+n3+n4+n5)/5;
        System.out.print("Average Of 5 Subjects is : " + Average);
       
       
    }
}