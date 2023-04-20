// String Method

class StringMethod
{
    public static void main(String args[])
    {
        String a = "ANKIT";
        String b = "rahul";

        System.out.println(a.toLowerCase());   //convert uppercase into lowercase
        System.out.println(b.toUpperCase());   //convert lowercase into uppercase

        System.out.println(b.concat(a));      //concat 2 string
        System.out.println(b.length());       //find length of a string

        String c = "   Vrushali  ";         
        String d = "";                       
        System.out.println(c.trim());          //trim/cut the space
        System.out.println(d.isEmpty());        // check string is empty or not

        System.out.println(b.charAt(2));
        System.out.println(c.indexOf('V'));
        System.out.println(a.equals(b));
         System.out.println(b.replace('r','m'));
    }
}




