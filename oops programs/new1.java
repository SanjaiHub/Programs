// import java.util.*;

// import java.util.Scanner;

class new1 {
    public void eat(){
        System.out.println("I am eating ");
    }
    public static void main(String[] args){
        System.out.println("1");
        new1 buzo = new new1();//class name true honi chahiye jis name se file save hai h or so on
        buzo.eat();
        buzo.run();//object.methodname
        //BIRDS CLASS KA OBJECT CREATE 
        Birds sp=new Birds();
        sp.fly();//call method

        // second object ke throw method ko call karna
        new1 aa=new new1();
        aa.eat();
        aa.run();
    
    }
    public void run(){
        System.out.println("I running");
    }
    
}
//Second class ke method ko call =jis class ka object create karenge usi ke method ko call kar sakte hai
class Birds{
    void fly(){
        System.out.println("Birds is flying");
        //main function ke andar hi run karwainge or call karnge 
        // aur iska alag se class and object create karenge 
    }
}

