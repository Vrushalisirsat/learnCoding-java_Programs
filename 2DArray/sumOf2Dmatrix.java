// Q.1 Java program to print addition of 2-matrix using 2D array.

import java.util.*;
class sumOf2Dmatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row and column of 1st matrix : ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.print("Enter the size of row and column of 2nd matrix : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

         
        int arr1[][] = new int[row1][col1];
        int arr2[][] = new int[row2][col2];
        System.out.println("Enter 1st 2D-Matrix element : ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 2nd 2D-Matrix element : ");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st 2D-Matrix is :");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("2nd 2D-Matrix is :");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }

        int sum[][] = new int[row1][col1];
        System.out.println("Sum Of 2D-Matrix is :");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}