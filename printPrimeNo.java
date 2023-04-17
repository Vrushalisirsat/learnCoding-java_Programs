// Q.31 WAP to print all prime numbers between two numbers.
// n1=10 , n2 = 20 ==> 11,13,17,19  <---all prime no. between 10 to 20.


import java.util.*;
class printPrimeNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n1 = sc.nextInt();  
        int n2 = sc.nextInt();
        
        int count=0;
        int i,j;
        for(i=n1;i<=n2;i++)
        {
            for(j=2;j<=i;j++)
            {
             if(i%j == 0)
             {
                break;
             }
            }
            if(i==j)
             System.out.print(j + " ");
        }
    }   
}
