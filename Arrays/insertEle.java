// Q.12 WAP to insert an element in an array.

import java.util.*;
class insertEle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.print("Enter array element : ");
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }

        System.out.print("Enter location of array : ");
        int loc = sc.nextInt();
        System.out.print("Enter new item : ");
        int item = sc.nextInt();

        System.out.print("Array Element are : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }

         
        for(int i=n;i>loc;i--)
        {
           arr[i] = arr[i-1];
        }
        arr[loc] = item;

        System.out.print("new Array Element are : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}