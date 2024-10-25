import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        System.out.println("Enter your operator ");
        char op = scan.next().charAt(0);
        scan.close();  
        if (op == '+') { 
            System.out.println("adition="+num1 + num2);
         } else if (op == '-') {
            System.out.println("mult="+(num1 - num2));
         } else if (op == '*') {
            System.out.println("mult="+num1 * num2);
         } else if (op == '/') {
            if (num2 != 0) {
                System.out.println("div=" +num1 / num2);
            } else {
                System.out.println("invalid");
            }
         }else {
            System.out.println("invalid operator");
         }
    
       
    }

}
