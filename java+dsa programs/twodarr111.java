import java.util.Scanner;

public class twodarr111 {
    /* 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int[][] numbers=new int[row][cols];
        //input
        //row
        for(int i=0;i<row;i++){
            //columns
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<row; i++){
            for(int j=0;j<cols;j++){
                //compare
                if (numbers[i][j]==x) {
                    System.out.println("x found at location("+ i + ","+ j +")");
                    
                }else{
                    System.out.println("x is not found at location("+ i + ","+ j +")");

                }
            }
        }
        sc.close();
    }
    */

    /* 
    //1. Print the spiral order matrix as output for a given matrix of numbers.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
  
  
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
             for(int j=0; j<m; j++) {
                 matrix[i][j] = sc.nextInt();
             }
        }
  
  
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
  
  
        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;
  
  
            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
  
  
            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
  
  
            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
        }
  
  
            System.out.println();
        
        sc.close();
     }*/

     
     // For a given matrix of N x M, print its transpose.
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
  
  
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
             for(int j=0; j<m; j++) {
                 matrix[i][j] = sc.nextInt();
             }
        }
  
  
        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<m ;j++) {
            for(int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
     }
  }
  
 
  

