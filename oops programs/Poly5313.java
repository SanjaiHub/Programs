/* 
//4. ovrriding and abstract method 
interface I1{
    void display1();
}
abstract class Test{
    abstract void display();
    void show() throws RuntimeException{
        System.out.println("1");
    }

}
class Xyz implements I1{//extends Test{
   public void display1(){

    }
    // void display(){

    // }
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Xyz x=new Xyz();
        x.show();
        
    }
}
*/

/*
//Invoking overridden method from sub class
class Test{
    void show(){
        System.out.println("1");
    }
}
class Xyz extends Test{
    void show(){
        super.show();//1
        System.out.println("2");//2
    }
    public static void main(String[] args) {
        Xyz x=new Xyz();
        x.show();//1,2
    }
}
 */
//which methods cannot override
class Test{
   synchronized void show(){ //private,static ,final
        System.out.println("1");
    }
}
class Xyz extends Test{
    void show(){//synchronized or strictfp
        System.out.println("2");//2
    }
    public static void main(String[] args) {
        Xyz x=new Xyz();
        x.show();//1,2
    }
}
