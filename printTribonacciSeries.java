//Q.32 WAP to print Tribonacci series.
// 0 1 2 3 6 11 20 .......   (add last 3 digits)

import java.util.*;
class printTribonacciSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();            // 5
        
        int a = 0;
        int b = 1;
        int c = 2;
        int d;
        for(int i=1;i<=n;i++)              // i=1, 2 , 3 , 4 , 5 , 6-(condition false)
        {
            System.out.print(a + " ");    // a = 0 , 1 , 2 , 3 , 6 
            d = a+b+c;      // c = a+b+c = 0+1+2=3 , 1+2+3=6, 2+3+6=11 
            a=b;          // a=b , a=1 , a=2 , a=3
            b=c;          // b=c, b=2 , b=3 , b=6 
            c=d;          // c=d , c=3, c=6, c=11
        }
    }
}