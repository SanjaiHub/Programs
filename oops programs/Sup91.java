/* 
//1. super keyword can be used to refer immediate parent class instance variable
class A{
    int i=12;
}
class B extends A{
    int i=11;
    void show(int i){
        System.out.println(i); //30
        System.out.println(this.i); //11
        System.out.println(super.i);//12
    }
    public static void main(String[] args) {
        B b=new B();
        b.show(30);
    }
}
*/


/* 
//super keyword can be used to invoke immediate parent class mathod 
class A{
    void m1(){
        System.out.println("i am in class A");
    }
}
class B extends A{
    void m1(){//overriding concept
        System.out.println("i am in class B");
    }
    void show(){
        m1();//i am in class B
        super.m1();// i am in class A
    }
    public static void main(String[] args) {
        B ob=new B();
        ob.show();
    }
}
*/

//3. super() can be used to invoke immediate parent class construtor
class A{
    A(){
        System.out.println("i m in class A");
    }
}
class B extends A{
    B(){
        // super(); //by defualt super use if not write
        System.out.println("i m in class B");
    }
    public static void main(String[] args) {
        B ob =new B();
    }
}