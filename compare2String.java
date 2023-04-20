// Q.java program to compare two string.

class compare2String
{
    public static void main(String args[])
    {
      // compare by using '==' operator  :->
    //   String a = "Lion";    //string object or string literal
    //   String b = "Lion";     //string object or string literal  ------True
    //   String b = new String("Lion");    //string object or string literal by using new keyword  ------false

    //   if(a == b)
    //   {
    //     System.out.print("True");
    //   }
    //   else{
    //     System.out.print("false");
    //   }

      // compare by using a.equals(b) operator  :->
      String a = "Lion";    //string object or string literal
      //String b = "Lion";     //string object or string literal  ------True
      String b = new String("LION");    //string object or string literal by using new keyword  ------false

      if(a.equals(b))
      {
        System.out.print("True");
      }
      else{
        System.out.print("false");
      }

    }
}