// Q.4 WAP to copy all elements of one array to another array.
// 1st arr[]={10,20,30} ------> 2nd brr[]={10,20,30} ............(dataType and size of array shoulb be same in both array...(2nd array size can be big but not small))
import java.util.*;
class copyArrEle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[n];
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

        System.out.print("\nSecond Array Element are : ");
        for(int i=0;i<n;i++)
        {
            brr[i] = arr[i];
            System.out.print(brr[i] + " ");
        }
    }
}