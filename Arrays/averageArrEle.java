// Q.7 WAP to find average of array elements.
// arr[5] = {1,2,3,4,5}  ------> sum=15 ------> average = sum/5 = 15/5 = 3.

import java.util.*;
class averageArrEle
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

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        int average = sum/n;
        System.out.print("\nAverage Of Array Element are : " + average);
    }
}