//import java.util.*;
public class StringBuilder13 {
    public static void main(String[] args) {
        /* 
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);

        //Char at index
        System.out.println(sb.charAt(3));

        //set char at index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //Insert at index
        sb.insert(0,'s');
        System.out.println(sb);

        //again
        sb.insert(4, 'n');
        System.out.println(sb);

        //delete extra char
        sb.delete(3, 4);
        System.out.println(sb);

        //again
        sb.delete(2, 4);
        System.out.println(sb);
        */

        /* 
        //append 
        StringBuilder sb=new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
        */

        //reverse string print 
        StringBuilder sb=new StringBuilder("Sanjay");
      //  StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length() -1-i;//5-1-i=4
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
           // Stringbuilder
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
