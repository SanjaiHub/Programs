/* 
class Test{
    public static void main(String[] args) {
        int a=100, b=0,c;
        c=a/b; //program abnormal terminate ho jayega 
        System.out.println(c);
        System.out.println("hello");
    }
}
*/

/* 
//exception handle by using try and catch

class Test{
    public static void main(String[] args) {
        try{
        int a=100, b=0,c;
        c=a/b; //program abnormal terminate ho jayega 
        System.out.println(c);
        }catch(ArithmeticException ae){
            // System.out.println(ae);

        }
        System.out.println("hello");
    }
}
*/

/* 
//first way with method abnormal terminate
 class Test{
    public static void main(String[] args) {
        Test t=new Test();
         t.divide();
    }
        void divide(){
        int a=100, b=0,c;
        c=a/b; //program abnormal terminate ho jayega 
        System.out.println(c);
        System.out.println("hello");
        }
 }
*/

/* 
//second way with mathod exeption handle using try and catch =and program successful execute

class Test{
    public static void main(String[] args) {
        Test t=new Test();
         t.divide();
    }
  void divide(){
    try{
        int a=100, b=0,c;
        c=a/b; 
        System.out.println(c);  
    }
    catch(ArithmeticException ae){
        // System.out.println(ae);
        ae.printStackTrace();

    }
    System.out.println("hello");

  }

 
}
*/

//second ka second way 
class Test{
    public static void main(String[] args) {
        Test t=new Test();
        try{
         t.divide();
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();

        }
        System.out.println("hello");
    }
  void divide(){
        int a=100, b=0,c;
        c=a/b; 
        System.out.println(c);  

  }
}



