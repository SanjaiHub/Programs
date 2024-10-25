import java.util.Scanner;

public class String121 {
    // 1. Take an array of Strings input from the user & find the cumulative
    // (combined) length of all those strings.
    /*
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
          int size=sc.nextInt();
          String[]array=new String[size];
          int totLength=0;
         for(int i=0;i<size;i++){
          array[i]=sc.next();
          
          totLength+=array[i].length();
          }
          System.out.println(totLength);
     }

         */
      
    public static void main(String[] args){
        // 3. Input an email from the user. You have to create a username from the email
        // by deleting the part that comes after ‘@’. Display that username to the user.

        Scanner sc = new Scanner (System.in);
        String email = sc.next();
        String userName = "";
        for(int i=0; i<email.length(); i++) {
        if(email.charAt(i) == '@') {
        break;
        } else {
        userName += email.charAt(i);
        }
        }
        System.out.println(userName);
        sc.close();
    }
    
}
