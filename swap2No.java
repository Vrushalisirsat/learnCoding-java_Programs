// Q.19  i) WAP to swap 2 number by using 3rd variable.

/*
import java.util.*;
class swap2No
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entera number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Before Swapping : " + n1 + " " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After Swapping : " + n1 + " " + n2);
    }
}
*/


// Q.19   ii) WAP to swap 2 number without using 3rd variable.

import java.util.*;
class swap2No
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entera number : ");
        int n1 = sc.nextInt();    // n1 = 100
        int n2 = sc.nextInt();    // n2 = 200

        System.out.println("Before Swapping : " + n1 + " " + n2);    //n1 =100 & n2 =200
        n1 = n1 +n2;                 // n1 = 100 + 200 => 300
        n2 = n1 - n2;                // n2 = 300 - 200 => 100
        n1 = n1 - n2;                // n1 = 300 - 100 => 200
        System.out.println("After Swapping : " + n1 + " " + n2);     //n1 =200 & n2 =100
    }
}