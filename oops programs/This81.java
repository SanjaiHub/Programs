//1 use
/* 
class ThisDemo{
    int i;
    void setValues(int i){
        //i=i;//o
        this.i=i;//11
    }
    void show(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.setValues(11);
        t.show();
    }
}
*/

/* 
//2 invoke current class
class ThisDemo{
    void display(){
    System.out.println("hrllo");
    }
    void show(){
        display();//or this.display implicitly
    }
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.show();
    }
}
*/


//3. 
/* 
class ThisDemo{
    ThisDemo(){ //default constructor
        System.out.println("No argument constructor");
    }
    ThisDemo(int a){
        this();
        System.out.println("parametrized constructore");  
    }
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo(11);
    }
} 
*/

/* 
//4
class ThisDemo{
    void m1(ThisDemo t){ //reference
        System.out.println("i am in m1 method");

    }
    void m2(){
        m1(this);

    }
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.m2();
    }
}
*/


//5
/* 
class Test{
    Test(ThisDemo t){
        System.out.println("test class constrt.");
    }
}
class ThisDemo{
    void m1(){ //reference
        Test t=new Test(this);
    }
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.m1();
    }
}
*/

//6

class ThisDemo{
    ThisDemo m1(){
        return this;
    }
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.m1();
    }
}