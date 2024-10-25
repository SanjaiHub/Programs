/* 
interface I1{
   // int a=10;// by default -public static final
    void show();// public abstract void show();// abstract void show();// void show();
    // static void display(){// default void display()

    // }
}
class Test implements I1{
    public void show(){ //if not use public generate error in compile time
        System.out.println("1");
    }
    public static void main(String[] args) {
       // I1 i=new I1(); //interface aur abstract class ka object create nahi kar sakte h
        Test t=new Test();
        t.show();
    }
}
*/

//for multiple inheritence
interface I1{
    void show();
   
 }
 interface I2{
    void display();
 }
 class Test implements I1,I2{
    public void show(){
        System.out.println("1");
    }
    public void display(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.display();
    }
 }
