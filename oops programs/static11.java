//static variable
/* 
class Test{
    static int a=10;
    void m1(){
        // static int b=20; //show error
        int b=20;
    }
}
*/

/* 
class Test {
    static int a=10;
    // int b=12;//error 
}
class Demo{
    public static void main(String[] args) {
        System.out.println(Test.a);
        // System.out.println(Test.b);///error
    }
}
*/

/* 
class Employee{
    int empid;
    String name;
    static String company="engineer";
    Employee(int empid,String name){
        this.empid=empid;
        this.name=name;
        
    }
    void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[] args) {
        Employee e1=new Employee(11, "Sanjay");
        e1.display();
        Employee e2=new Employee(21, "Sanju");
        e2.display();
    }
}
*/


class CounterDemo{
   static int count=0;
    CounterDemo(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        CounterDemo c1=new CounterDemo();
        CounterDemo c2=new CounterDemo();
        CounterDemo c3=new CounterDemo();
        
    }
}