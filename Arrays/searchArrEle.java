// Q.6 WAP to search an element in an array.
// arr[5]={1,2,3,4,5}
//search element = 4 ----element found
//search element = 9 ----element not found

import java.util.Scanner;
class searchArrEle
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

        System.out.print("\nEnter search Element : ");
        int s = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i] == s)
            System.out.print("Element " + arr[i] + " found at index " + i);
        }
    }
}