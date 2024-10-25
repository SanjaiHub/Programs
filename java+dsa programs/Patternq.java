 class Patternq {
    public static void main(String[] args) {
        /* 1. question print the solid Rectangle pattern 
          *****
          *****
          *****
          *****
        */

       /*  int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print('*');

            }
            System.out.println();
        }*/

        /* 2. Print the pattern 
          * * * * *
          *       *
          *       *
          * * * * *
         */

       /*  int n=4;
         int m=5;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (i==1||j==1|| i==n||j==m) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
         */ 
        /* 3.Print Pattern Half Pyramid
         *
         * * 
         * * *
         * * * *
         */
       /* int n=4;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */ 

        /* 4. Print the Patern 
         * * * * *
         * * * *
         * * *
         * *
         * 
         
         */
      /*   int n=5;
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            System.out.println();
        }
      */

      /* 5.Print  the Pattern 
               *
             * *
           * * *
         * * * * 
       */
      /* 
      int n=4;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
      */
      /* 6:- print the pattern
       1 
       12
       123
       1234
       12345
     */
      /* 
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j);
        }
        System.out.println("");
      }
      */
      /* 7:- print the pattern
        12345
        1234
        123
        12
        1
      */
      /* 
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
          System.out.print(j);
        }
        System.out.println(" ");
      }
      */
      /* 8:- print the pattern 
        1
        2 3
        4 5 6
        7 8  9 10
        11 12 13 14 15
      */
       
      /* 
       int n=5;
       int number=1;
       for(int i=1; i<=n;i++){
        for(int j=1;j<=i;j++){

          System.out.print(number+" ");
          number++;
        }
        System.out.println();
       */
      //  }
      
      /* Print the pattern
          1
          0 1
          1 0 1
          0 1 0 1 
          1 0 1 0 1
         
      */ 
       
       int n=5;
       for(int i=1;i<=n; i++){
        for(int j=1; j<=i; j++){
          int sum = i+j;
          if (sum % 2==0) {
            System.out.print("1 ");
            
          }else{
            System.out.print("0 ");
          }
        }System.out.println();
       

      
      
      

         
    }
  }
}
