import java.util.Scanner;

public class Loopq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number"+"");
        int n = sc.nextInt();
        sc.close();
        
        //sum of n natural number
       /*  int sum = 0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        */

        //print table by user
        for(int i=1;i<11;i++){
        System.out.println(i*n);
        }
    }
}
