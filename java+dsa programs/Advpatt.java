public class Advpatt {
  public static void main(String[] args) {
      /*   //BUTTERFLY PATTERN   
        int n=5;
        //upper half
        for(int i=1;i<=n; i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            int spaces=2*(n-i);
            for(int j=1;j<=spaces; j++){
                System.out.print(" ");
            }
            //second part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half 
        for(int i=n;i>=1; i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            int spaces=2*(n-i);
            for(int j=1;j<=spaces; j++){
                System.out.print(" ");
            }
            //second part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      */

      /* 
      //PRINT THE PATTERN ( SOLID RHOMBUS)
      int n=5;
      for(int i=1; i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){

            System.out.print(" ");
        
        }
        //stars
        for(int j=1;j<=5;j++){

            System.out.print("*");
        }
        System.out.println();
      }*/
       
       //print the pattern Number Pyramid
       int n=5;
       for(int i=1;i<=n;i++){
        //spces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //number
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
       }
       /* 

       //print the pattern 
       int n=5;
       for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //1st Half Number
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        //2nd half no.
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();


       }*/
       //print the pattern DIAMOND PATTERN.
       /*  *
       **


        
        */
        /* 
       int n=4;
       //uppar half
       for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       //lower  half
       for(int i=n;i>=1;i--){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
      }*/


    }
}
