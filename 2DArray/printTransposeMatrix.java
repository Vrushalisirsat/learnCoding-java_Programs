// Q.1 Java program to print transpose of matrix using 2D array.

import java.util.*;
class printTransposeMatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int row = sc.nextInt();
        System.out.print("Enter the size of column : ");
        int col = sc.nextInt();

         
        int arr[][] = new int[row][col];
        System.out.println("Enter 2D Matrix element : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Matrix is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Mirror Of 2D-Matrix is :");
        for(int i=0;i<row;i++)
        {
            for(int j=1;j>=0;j--)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}