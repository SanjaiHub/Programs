import java.util.Scanner;

public class function1 {
    /* 
    //make a function to add 2 numbers and return the sum.
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       // System.out.print("Enter the first Number="+" ");

        int a=sc.nextInt();

      //  System.out.print("Enter the Second Number="+" ");

        int b=sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println(sum);

      //  System.out.println("This is result= "+sum);
        sc.close();
    }
 
   
  //Make a function to multiply 2 numbers and return the product.
  public static int calculateProduct(int a,int b){
   // int product=a*b;
    return a*b;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
   // int product=calculateProduct(a, b);
    System.out.println(calculateProduct(a, b));
    sc.close();

  }  */

  //Find the Factorial of a Number.
  public static void printFactorial(int n){
    //loop
    if(n<0){
        System.out.println("invalid");
        return;
    }
    int factorial=1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println(factorial);
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    printFactorial(n);
    sc.close(); 
  }

    
}
