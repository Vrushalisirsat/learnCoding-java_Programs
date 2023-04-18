// Q.8 WAP to sort/arrange array element in ascending order.
// arr[5] = {5,6,2,7,3} -------->sort array in ascending order = {2,3,5,6,7}

import java.util.*;
class sortAsce
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

        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
           {
            if(arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           }
        }

        System.out.print("\nSort Array Element in Ascending Order : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}