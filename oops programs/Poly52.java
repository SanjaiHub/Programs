//METHOD Overriding

/* 
//1. No. of argument same
public class Poly52 {
    void show(){
        System.out.println("1");
    }  

}
class Xyz extends Poly52{
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Poly52 p=new Poly52();
        p.show();//1

        Xyz x=new Xyz();
        x.show();//2

    }
}
*/


/* 
//2.type of argument same
public class Poly52 {
    void show(String a){
        System.out.println("1");
    }  

}
class Xyz extends Poly52{
    void show(String a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Poly52 p=new Poly52();
        p.show("abc");//1

        Xyz x=new Xyz();
        x.show("abc");//2

    }
}

*/

// 3 . sequence of argument same 

public class Poly52 {
    void show(String a,int b){
        System.out.println("1");
    }  

}
class Xyz extends Poly52{
    void show(String a,int b){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Poly52 p=new Poly52();
        p.show("abc",12);//1

        Xyz x=new Xyz();
        x.show("abc",12);//2

    }
}