// Q.9 WAP to compare 2 array. (by using ==  & equals() method)

import java.util.Scanner;
import java.util.Arrays;
class compareArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.print("Enter array-1 elements : ");
        for(int i=0;i<n;i++)
        {
           arr1[i] = sc.nextInt();
        }
        System.out.print("Enter array-2 elements : ");
        for(int i=0;i<n;i++)
        {
           arr2[i] = sc.nextInt();
        }

        System.out.print("Array Elements are : ");
        for(int x : arr1)
        {
            System.out.print(x + " ");
        }

        // 1) == operator :- only see referenced variable not see array element are equal or not
        if(arr1 == arr2)
        {
            System.out.print("\nBoth array are equal");
        }
        else{
            System.out.print("\nBoth array are not equal");
        }

        // 2) Equals() method = compare 2 array is equal or not.
        if(Arrays.equals(arr1,arr2))
        {
            System.out.print("\nBoth array are equal");
        }
        else{
            System.out.print("\nBoth array are not equal");
        }

    
}
}