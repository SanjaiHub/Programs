
//POlymorphism where mathod name same class same and No. of argument different

/*
//NO. of Argument different
public class Poly5 {
    void show(int a,int b){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Poly5 ar=new Poly5();
       ar.show(10);//print 2
        ar.show(5, 6);//print 1 because no.of argument different
    }
}
 */

 /*
 // Sequence of Argument different

 public class Poly5{
    void show(int a,String b){
        System.out.println("1");
    }
    void show(String a,int b){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Poly5 ar=new Poly5();
        ar.show("abc",10); //print 2
        ar.show(10,"abc"); //print 1
    }
}
 */

 //type of argument different

 public class Poly5{
    void show(int a){
        System.out.println("1");
    }
    void show(String a){
        System.out.println("2");

    }
    public static void main(String[] args) {
        Poly5 ar=new Poly5();
        ar.show("sanju");//print 2
        ar.show(10);//print 1

    }
 }