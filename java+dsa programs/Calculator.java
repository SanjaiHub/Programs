// public class Calculator {
//     public static void main(String[] args) {
//        int a=12;
//         int b=2;
//         int add=a+b;
//         System.out.println(add);
//         int diff=a-b;
//         System.out.println(diff);
//         int mult=a*b;
//         System.out.println(mult);
//         int div=a/b;
//         System.out.println(div);
     
  
//     }
    
// }
public class Calculator {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        
        int add = a + b;
        System.out.println("Addition: " + add);
        
        int diff = a - b;
        System.out.println("Difference: " + diff);
        
        int mult = a * b;
        System.out.println("Multiplication: " + mult);
        
        // Using double for division to get a floating-point result
        double div = (double) a / b;
        System.out.println("Division: " + div);
    }
}

