import java.util.Scanner;

public class Bitmanip14 {
    public static void main(String[] args) {
        /* 
        //Get bit
        int n=5;//0101
        // int pos=2;
        // int pos=3;
        int pos =4;zx       
       int bitMask=1<<pos; 
       if ((bitMask&n)==0) {
        System.out.println("bit was zero");
        
       }else
       System.out.println("bit was one");
       */
      /* 
      //Set Bit.
      int n=5;
      int pos=1;
      int bitMask=1<<pos;
      int newNumbers=bitMask|n;
      System.out.println(newNumbers);
      */
      /* 
      //Clear bit 
      int n=5;
      int pos=2;
      int bitMask=1<<pos;
      int notBitMask=~(bitMask);
      int newNumbers=notBitMask & n;
      System.out.println(newNumbers);
      */

      //Update Bit
      Scanner sc=new Scanner(System.in);
      int oper=sc.nextInt();
      //oper=1:set oper=0:clear
      int n=5;
      int pos=1;
      int bitMask=1<<pos;
      if (oper==1) {
        int newNumber=bitMask|n;
        System.out.println(newNumber);
      }else{
        int newBitMask=~(bitMask);
        int newNumber=newBitMask&n;
        System.out.println(newNumber);
      }
      sc.close(); 
    }
}
//input 1 7uand output 7