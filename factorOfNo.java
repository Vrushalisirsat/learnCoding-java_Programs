// Q.23 WAP to find factor of given number.

import java.util.*;
class factorOfNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();  

        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                System.out.print(i + " ");
            }
        }
       
    }
}