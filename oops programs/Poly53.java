//Do Overriding method must have same return type?
public class Poly53 {
    Object show(){  //String  //parent class ka return type bada ya same hona chahiye child class ke return type se
        System.out.println("1");
        return null;
    }  
}
class Xyz extends Poly53{
    String show(){
        System.out.println("2");
        return null;
    }
    public static void main(String[] args) {
        Poly53 t=new Poly53();
        t.show();

        Xyz x=new Xyz();
        x.show();
    }
}
