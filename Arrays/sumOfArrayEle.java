// Q.5 WAP to find sum of array element in java.
// arr[5]={1,2,3,4,5} ==> sum=15

import java.util.Scanner;
class sumOfArrayEle
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
        System.out.print("\nSum Of Array Element are : " + sum);
    }
    }