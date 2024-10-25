//Type of Inheritance 

/* 
//Single level Inher.

public class A41 {
    void showA(){
        System.out.println("A class method");
    } 
}
class B extends A41{
    void showB(){
        System.out.println("B class method");
    }
    public static void main(String[] args) {
        A41 ob1=new A41();//A class ke object se sirf A class ke method ko call kar sakte h B class ke method ko call nahi kar sakte hai
        ob1.showA(); //only this
       // ob1.showB(); //provide error

       //B class ke object ke throw A and B dono class ke method ko call karwa sakte h so
       B ob2=new B();
       ob2.showA();
       ob2.showB();


    }

}
*/

/*
//MultiLevel Inheritance
class A41{
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A41{
    void showB(){
        System.out.println("B class method");
    }

}
class C extends B{
    void showC(){
        System.out.println("C class method");
    }
    public static void main(String[] args) {
        A41 ob1=new A41();
        ob1.showA();//true
       // ob1.showB();  //nahi likh sakte h
       //ob1.showC();  // nahi likh sakte h
       System.out.println("--------------------");

       B ob2= new B();
       ob2.showA();
       ob2.showB();
       //ob2.showC(); // nahi likh sakte h
       System.out.println("------------------");

       C ob3=new C();
       ob3.showA();
       ob3.showB();
       ob3.showC();
    }

}
 */

 //Hierarchical Inheritance

 class A41{
    void showA(){
        System.out.println("A class method");
    }
 }
 class B extends A41{
    void showB(){
        System.out.println("B class method");
    }
 }
 class C extends A41{
    void showC(){
        System.out.println("C class method");
    }
    public static void main(String[] args) {
        A41 ob1=new A41();
        ob1.showA();
       // ob1.showB();
       // ob1.showC();
       System.out.println("----------");

       B ob2=new B();
       ob2.showA();
       ob2.showB();
       //ob2.showC();
       System.out.println("---------");

       C ob3=new C();
       ob3.showA();
     //  ob3.showB();
       ob3.showC();

    }

 }
