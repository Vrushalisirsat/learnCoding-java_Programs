//Q.3 WAP to print array elements in reverse order.
// arr[5] = 1 2 3 4 5 -------> 5 4 3 2 1 

import java.util.Scanner;
class reverseArrayEle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array element : ");
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }

        System.out.print("Array Element are : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }

        System.out.print("\nReverse Array Element are : ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}