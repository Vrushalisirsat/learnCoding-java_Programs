// Q. java program to reverse a string .

class reverseString
{
    public static void main(String args[])
    {
        //1) By using StringBuffer() method.
        StringBuffer str = new StringBuffer("Learn Coding");
        System.out.println(str.reverse());

        //2) By using StringBuilder() method.
        StringBuilder str1 = new StringBuilder("Vrushali_Sirsath");
        System.out.println(str1.reverse());
        
        //3) by using
        String str3 = "JAVA";
        String str4 = "";
       
        for(int i=str3.length()-1;i>=0;i--)
        {
            str4 = str4 + str3.charAt(i);
        }
         System.out.println(str4);
    }
}




