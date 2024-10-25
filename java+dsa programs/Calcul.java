import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter operator");
        char op = scanner.next().charAt(0);
        scanner.close();
        int output;
        if (op=='+') {
            output = num1+num2;   
            System.out.println(output);
        }else if (op=='-') {
            output = num1 - num2;
            System.out.println(output);
            
        }else if (op=='*') {
            output = num1 * num2;
            System.out.println(output);
            
        }else if (op=='/') {
            if (num2 != 0) {
                output = num1 / num2;
                System.out.println(output);
            } else {
                System.out.println("Error! Dividing by zero is not allowed.");
                
            } 
        }else{
            System.out.println("invalid");
        }

    }
}
