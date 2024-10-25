/*
class Pen{
    String color;
    String type;

 public void write(){
    System.out.println("writing something");
}
public void printColor(){
    System.out.println(this.color);
}
}
 */

class Student{
    String name;int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // //no argument const.
    // Student(){
    //     System.out.println("No argument const.");
    // }

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Oop23 {
    public static void main(String[] args) {

        /*
        Pen pen1=new Pen();
        pen1.color="black";
        pen1.type="gel";
        pen1.write();//method calling

        Pen pen2=new Pen();
        pen2.color="blue";
        pen2.type="ballpoint";
        pen1.printColor();
        pen2.printColor();

         */

        //  Student s1=new Student();
         Student s1=new Student("Sanju",13);
        //  s1.name="Sanjay";
        //  s1.age=18;
          s1.printInfo();

    }
    
}
