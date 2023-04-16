// Q.22 WAP to check a year is leap year or not.
// conditions : 1) centuary - (year%100 = 0 and year%400 = 0)   -----> 2000 - 2400 => leap year || but 1700 1800 1900 => not a leap year bcoz its not give zero by dividing by 400. 
//              2) yearly - (year%100 != 0 && year%4 == 0)    -------> 2020 - 2024 => leap year || but 2021 2022 2023 => not a leap year bcoz its not give zero by dividing by 4.

import java.util.*;
class leapYearOrNot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year : ");
        int year = sc.nextInt();   
       
        if(year%100 == 0 && year%400 == 0 || year%100 != 0 && year%4 == 0)
        {
            System.out.println(year + " is a Leap year");
        }
        else{
              System.out.println(year + " is Not a Leap year");
        }
        
    }
}