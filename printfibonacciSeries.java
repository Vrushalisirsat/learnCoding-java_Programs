//Q.31 WAP to print Fibonacci Series.
// 0 1 1 2 3 5 8 13 ....

import java.util.*;
class printfibonacciSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();            // 5
        
        int a = 0;
        int b = 1;
        int c;
        for(int i=1;i<=n;i++)              // i=1, 2 , 3 , 4 , 5 , 6-(condition false)
        {
            System.out.print(a + " ");    // a = 0 , 1 , 1 , 2 , 3 
            c = a+b;      // c = a+b = 0+1=1 , 1+1=2, 1+2=3 , 2+3=5 , 3+5=8
            a=b;          // a=b , a=1 ,a=1 , a=2 , a=3 , a=5
            b=c;          // b=c, b=1 , b=2 , b=3 , b=5 ,b=8
        }
    }
}