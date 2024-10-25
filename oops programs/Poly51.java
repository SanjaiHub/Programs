//Question and spacial Cases of Method Overloading 
//1. Can We achieve method overloding by changing the return type of method only
//2. Can we overload java  main() method ?
//3. Method Overloading and Type Promotion
//4. Different cases of type Promotion

/*
//1. Can We achieve method overloding by changing the return type of method only
//Ans =NO and this is program
public class Poly51 {
    void show(int a)
    {
        System.out.println("1");
    }
    String show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Poly51 ar=new Poly51();
        ar.show(10);
    }
}
 */

/* 
 //2. Can we overload java  main() method ?
// Yes and this is program
 public class Poly51 {
    public static void main(String[] args) {
        System.out.println("1");
        Poly51 mt=new Poly51();
        mt.main(20);
        
    }
    public static void main(int a) {
        System.out.println("2");
    }  
 }
 */


//3. Method Overloading and Type Promotion
/* 
//Method Overloading - Case 1

public class Poly51 {
    void show(int a){
        System.out.println("int method");
    }
    void show(String a){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Poly51 mo=new Poly51();
        mo.show(10); //int method
        mo.show("Sanju");//String Method
        System.out.println("--------------------");
        //and if pass character argument then print int method because here working is type promote
        mo.show('a');
    }   
}
*/

/*
//Method Overloading - Case 2

public class Poly51 {
    void show(Object a){
        System.out.println("Object method");
    }
    void show(String a){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Poly51 mo=new Poly51();
        mo.show('a');//object method -print hoga because of auto promotion 
        
        mo.show("abc");//print String method which child class so preference is child class 
    }   
}
 */


 /* 
 //Method Overloading - Case 3

 public class Poly51 {
    void show(StringBuffer a){
        System.out.println("Stringbuffer mathod");
    }
    void show(String a){
        System.out.println("string method");
    }

    public static void main(String [] args){
        Poly51 mo=new Poly51();
        mo.show("abc"); //string method
        mo.show(new StringBuffer("xyz"));
       // mo.show(null);//confuse compiler and ambiguity error

    } 
 }
 */


 /* 
 //Method Overloriding - Case4

 public class Poly51 {
    void show(String a, float b){
        System.out.println("int float method");
    }
    void show(float a,int b){
        System.out.println("float int method");
    }
    public static void main(String[] args) {
        Poly51 mo=new Poly51();
       // mo.show(10, 20.5f);//int float method
       // mo.show( 20.5f,10);//float int  method
       // mo.show(10,20);//number of argument jyada hai to direct promote nahi ho sakta h =ambiguity

       // different data type hai to auto matic promote kar dega  
       mo.show("abc", 10); // int float method
    } 
 }
*/


//Method overloading -Case 5

public class Poly51 {
    void show(int a){
        System.out.println("int method");
    }
    void show(int... a){
        System.out.println("varargs method");
    }
    public static void main(String[] args) {
        Poly51 mo =new Poly51();
        mo.show(12);//int method
        mo.show(12,23,43,445);//varargs method
        mo.show();//varargs beause zero and multiple argument ke case mein varargs use hota h
    }

    
}






