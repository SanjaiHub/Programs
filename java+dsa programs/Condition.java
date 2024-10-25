import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //if else statement 
    /*  int age = scan\.nextInt();
        if (age>18) {
            System.out.println("Adult");
        }
        else{
            System.out.println("not adult");
        } 
    */

    /*  int x = sc.nextInt();
        if(x%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    */

        //else if statement or ladder if statement
    /*  int a = scan.nextInt();
        int b = scan.nextInt();
        if (a==b) {
            System.out.println("equal");
        } else if (a>b) {
                System.out.println("a is greater");
                
        }
        else{
                
            System.out.println("a is lesser");

            }
    */
            //quiz or print greeting
            int button = scan.nextInt();
            scan.close();
     /*   if (button==1) {
                System.out.println("Hello");                
            }
            else if (button==2) {
                System.out.println("Namaste");
                
            }
            else if(button==3){
                System.out.println("bonjour");

            }
            else{
                System.out.println("invalid");
            }
     */
    switch (button) {
        case 1: System.out.println("hello");
         break;
         case 2: System.out.println("namase");
         break;
         case 3:System.out.println("bonjour");
         break;
        default:System.out.println("invalid");
    }
    }
}
