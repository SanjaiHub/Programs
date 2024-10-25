import java.util.HashSet;

public class Recursion17 {
    /* 
    public static void towerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("tramsfer disk "+ n +" from " + src+" to " + dest);
            return;
        }
        towerofHanoi(n - 1, src, dest, helper);
        System.out.println("tramsfer disk "+ n +" from " + src+" to " + dest);
        towerofHanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
       // int n = 1;
       //int n=2;
       int n=3;
        towerofHanoi(n, "s", "h", "d");

    }*/

    /* 
    //Print a String in Reverse="abcd"
    public static void printRev(String str,int idx){
        if (idx==0) {
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static void main(String[] args) {
        String str="abcd";
        printRev(str, str.length()-1);
        
    }*/

/* 
    //Find the 1st & last occurance of an element in String. "abaacdaefaah"
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str,int idx,char element){
        if (idx==str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;   
        }
        char currChar=str.charAt(idx);
        if (currChar==element) {
            if (first==-1) {
                first=idx;
                
            }else{
                last=idx;
            }
            
        }
        findOccurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOccurance(str, 0,'a');
    }
    */


  /* 
    //check if an array is sorted (strictly increasing)={1,2,3,4}
    public static boolean isSorted(int arr[],int idx){
        if (idx==arr.length-1) {
            return true;
            
        }

        // if (arr[idx]<arr[idx+1]) {
            //array is sorted till now 
            // return isSorted(arr, idx+1);
        // }else{
            // return false;

        // }
        if (arr[idx]>=arr[idx+1]) {
            //an array is unsorted
            return false;
            
        }
       return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2};//false
       //int arr[]={1,2,4};//true
        System.out.println(isSorted(arr, 0));
    }*/

    /* 
    //Move all 'X' to the end of the string="axbcxxd"
    public static void moveAllx(String str, int idx,int count,String newString){
        if (idx==str.length()) {
            for(int i=0;i<count;i++){
                newString+='X';
            }
            System.out.println(newString);
            return;
            
        }

        char currChar=str.charAt(idx);
        if (currChar=='x') {
            count++;
            moveAllx(str, idx+1, count, newString);

            
        }else{
            newString+=currChar;
            moveAllx(str, idx+1, count, newString);
        }
    } public static void main(String[] args) {
        String str="axbcxxd";
        moveAllx(str, 0, 0,"");
    }*/

/* 
    //Remove duplicate in a String"abbccda"
    public static boolean[] map=new boolean[26];
    public static void removeDupli(String str, int idx, String newString ){
        if (idx==str.length()) {
            System.out.println(newString);
            return;
            
        }

        char currChar=str.charAt(idx);
        if (map[currChar-'a']) {
                removeDupli(str, idx+1, newString);
        
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDupli(str, idx+1, newString);
        }
    }
     public static void main(String[] args) {
    String str="abbccda";
    removeDupli(str, 0, "");
    }*/

    /* 
    // 'IMP" Print all the Sub-Sequence of a string="abc"
    public static void subsequence(String str, int idx, String newString){
        if (idx==str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        //to be
        subsequence(str, idx+1, newString+currChar);

        //or not to be
        subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";  
        subsequence(str, 0, "");

    }*/

    /* 
    //  Print all the Unique Sub-Sequence of a string="aaa"
    public static void unisubsequence(String str,int idx, String newString ,HashSet<String>set){
        if (idx==str.length()) {
            if (set.contains(newString)) {
                return;
                
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }

        char currChar=str.charAt(idx);
        //to be
        unisubsequence(str, idx+1, newString+currChar, set);
        //or not to be
        unisubsequence(str, idx+1, newString, set);

    }
      public static void main(String args[]){
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        unisubsequence(str, 0, "", set);
      }
      */

      //Print Keypad Combination
      public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
      public static void printComb(String str,int idx,String combination){
        if (idx==str.length()) {
            System.out.println(combination);
            return;
            
        }

        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
      }
      public static void main(String[] args) {
        String str="23";
        printComb(str, 0, "");

        
      }
    
}