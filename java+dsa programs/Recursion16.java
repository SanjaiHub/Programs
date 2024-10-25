import java.util.*;

public class Recursion16 {
    /*
    // 1- Print number 5 to 1
    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumb(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumb(n);
    }
    */
/* 
    // 2- Print number 1 to 5
    public static void printNumb(int n){
        if (n==6) {
            return; 
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNumb(n);
    }*/
    
/* 
    //3-Print the Sum of n natural number
    public static void  printSum(int i,int n,int sum){
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
            
        }
        sum +=i;
        printSum(i+1, n, sum);
      //   System.out.println(i);
    }
    public static void main(String[] args) {
        printSum(1, 4, 0);
        
    }*/

/* 
    //4- print Factorial of a number n
    public static int calculatefact(int n){
        if (n==1||n==0) {
            return 1;
            
        }
        int fact_1=calculatefact(n-1);
     //   int fact_n=n*fact_1;
        return n*fact_1;
       // return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
      //  int ans=calculatefact(n);
        System.out.println(calculatefact(n));
    }*/
  /*
    //5- Print the fibonacci sequence till nth term*
    public static void calculatefib(int a ,int b,int n){
        if (n==0) {
            return;
            
        }
        int c=a+b;
        System.out.println(c);
        calculatefib(b,c,n-1);
    }
    public static void main(String[] args) {
        int a =0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n=8;
        calculatefib(a, b, n-2);
    } */
    
/* 
    //print x^n(stack hieght=n)
    public static int calPower(int x,int n){
        if (n==0) {//base case1
            return 1;
            
        }
        if (x==0) {//base case2
            return 0;
            
        }
        int xPownm1=calPower(x,n-1);//kaam
        int xPown=x*xPownm1 ;
        return xPown;    
    }
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       // System.out.print("input x=");
      //  int x=sc.nextInt();
       // System.out.print("input n=");
     //   int n=sc.nextInt();
        int x=2, n=5;
        int ans=calPower(x, n);
        System.out.println(ans);
      //  sc.close();

    }*/

    public static int calPower(int x,int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
    //if n is even
      if (n%2==0) {//even
        return calPower(x, n/2)*calPower(x, n/2);     
    }else{//odd
        return calPower(x, n/2)*calPower(x, n/2)*x;
    }
  }
  public static void main(String[] args) {
    int n=5,x=2;
    int ans =calPower(x, n);
    System.out.println(ans);
  }


}
