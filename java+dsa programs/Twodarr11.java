import java.util.Scanner;

public class Twodarr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int [][] numbers=new int[row][cols];
        //input
        //row
        for(int i=0;i<row;i++){
            //columns
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0; i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
        
        System.out.println();
        }
        sc.close();
    }
    
}