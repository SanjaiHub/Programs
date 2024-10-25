//2 case OVERRIDING AND ACCESS MODIFIERS
 class Test{
    void show(){ //protected
        System.out.println("1");
    }  
}
class Xyz extends Test{
    public void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show();

        Xyz ob=new Xyz();
        ob.show();
    }
}
