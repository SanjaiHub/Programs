import java.util.Scanner;

public class Array10 {
    /*
     * public static void main(String[] args) {
     * int[] marks=new int[3];
     * marks[0]=97;//phy
     * marks[1]=98;//chem
     * marks[2]=95;//eng
     * //System.out.println(marks[0]);
     * //System.out.println(marks[1]);
     * //System.out.println(marks[0]);
     * for(int i=0;i<3;i++){
     * System.out.println(marks[i]);
     * }
     * }
     */

    //1. Take an array of names as input from the user and print them on the screen.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];
        // input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        // output
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is : " + names[i]);
        }
        
    }
}
