// What is called array?
// An array is a collection of elements of the same type placed in contiguous memory locations that can be individually referenced by using an index to a unique identifier.
// Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location.
// Java Arrays
// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
// To declare an array, define the variable type with square brackets:  String[] cars; / int arr[] ...


// Q.1 print array element in java.
/*
import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element : ");
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }

        System.out.println("Array Element are : ");
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}

//-------------------------------------------------------------------------------------------------------------------------------

//Q.2  java program to print array elements using Arrays class methods.
// below are 3 static method of array class in java to print the array element.
// 1) toString() method
// 2) asList()  method
// 3) deepToString() method :- it accepts 2D array.

import java.util.Scanner;
import java.util.Arrays;
class array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element : ");
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }
        String brr[] = {"Vrushali" , "Sirsath" , "Vandana" , "Om"};

        // 1) toString() method
        System.out.println("Array Element are (toString() method) : " + Arrays.toString(arr));
        System.out.println("Array Element are (toString() method) : " + Arrays.toString(brr));

        // 2) asList()  method
        System.out.println("Array Element are (asList() method) : " + Arrays.asList(arr));  //for Integer : asList() method print the reference of an array ,not print the integer array element
        System.out.println("Array Element are (asList() method) : " + Arrays.asList(brr));
        
        // 3) deepToString() method
        int a[][] = {{10,20},{30,40}};
        System.out.println("Array Element are (deepToString() method) : " + Arrays.deepToString(a));
        System.out.println("Array Element are (deepToString() method) : " + Arrays.deepToString(brr));


    }
}

*/


//----------------------------------------------------------------------------------------------------------------------------------

// Array Methods in java
// 1) sort() method = To sort array element bydefault in ascending order.
// 2) Equals() method = compare 2 array is equal or not.
// 3) copyOf() method = copy 1-array element in other array element.

import java.util.Scanner;
import java.util.Arrays;
class array
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

        // 1) sort() method = To sort array element bydefault in ascending order.
        System.out.print("\nSort Array Elements are : ");
        Arrays.sort(arr1);
        for(int x : arr1)
        {
            System.out.print(x + " ");
        }

        // 2) Equals() method = compare 2 array is equal or not.
        boolean b = Arrays.equals(arr1,arr2);
        System.out.print("\nIs both array are equal or not ? " + b);

        // 3) copyOf() method = copy 1-array element in other array element.
        int arr3[] = Arrays.copyOf(arr1,n);
         System.out.print("\n Copied Array Elements are : ");
        for(int x : arr3)
        {
            System.out.print(x + " ");
        }

    }
}