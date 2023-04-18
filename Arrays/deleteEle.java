// Q.13 WAP to delete an element in an array.

import java.util.*;
class deleteEle
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

        System.out.print("Enter location of array : ");
        int loc = sc.nextInt();

        System.out.print("Array Element are : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }

        for(int i=loc;i<n-1;i++)
        {
           arr[i] = arr[i+1];
        }
       

        System.out.print("\nnew Array Element are : ");
        for(int i=0;i<n-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}