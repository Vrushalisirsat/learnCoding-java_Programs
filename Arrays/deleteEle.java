// Q.11 WAP to delete an element in an array.

import java.util.*;
class smallEle
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

         int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.print("\nSmallest Element is " + min);
    }
}