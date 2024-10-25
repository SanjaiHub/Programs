//import java.util.*;

//import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        /* 
        //string declaration.
        String name="Sanjay";
        String fullname="Sanjay kumar Kashyap";
        String sentence="Sanjay is a future engineer";
        System.out.println(name);
        System.out.println(fullname);
        System.out.print(sentence);
      */

      /* 
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      //String name=sc.next();
      System.out.println(name);
      sc.close();
       */

      /* 
      String name="tony";
      String fullname="stark";
      String result=name+ "" +fullname;
      //System.out.println(name+" "+fullname);
     // System.out.println(result);
      System.out.println(result.length());//for string length
      //chartAt
      for(int i=0; i<result.length(); i++){
        System.out.println(result.charAt(i));
      }
      */

      /* 
      //compare string
      String name1="tony";
      String name2="stark";
      if (name1.compareTo(name2)==0) {
        System.out.println("String are equal");
        
      }else{
        System.out.println("String are not equal");
      }*/


      //string nikalana
     // String sentence="my name is sanjay";
     // String name=sentence.substring(11,sentence.length());
     String sentence="SanjayAbhi";
     //String name=sentence.substring(0,4);
     String name=sentence.substring(6);
      System.out.println(name);

    }
}
