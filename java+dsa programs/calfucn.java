import java.util.Scanner;

public class calfucn {
    public static int calcSum(int a,int b){
         return a+b;
    }
    public static int calcProduct(int a, int b){
        return a*b;
    }
    public static int calcdivide(int a, int b){
        return a/b;
    }
    public static int calcdiff(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("add"+calcSum(a, b));
        System.out.println("prod"+calcProduct(a, b));
        System.out.println("div"+calcdivide(a, b));
        System.out.println("diff"+calcdiff(a,b));
        scan.close();
    }
    
}
