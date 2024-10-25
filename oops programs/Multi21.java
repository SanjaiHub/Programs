/* 
//performing single task from single thread
class Mythread1 extends Thread{
    public void run(){
        System.out.println("task 1");
    }
}
public class Multi21{
    public static void main(String[] args) {
        Mythread1 th=new Mythread1();
        th.start();
    }
}
*/

/* 
//performing single task from multiple thread
class MyThread1 extends Thread{
    public void run(){
        System.out.println("task 12");
    }
}
public class Multi21{
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
        MyThread1 t2=new MyThread1();
        t2.start();
    }
}
*/

/* 
//performing multiple task from multiple thread
class MyThreads1 extends Thread{
    public void run(){
        System.out.println("task 11");
    }
}
class MyThreads2 extends Thread{
    public void run(){
        System.out.println("task 22");
    }
}
public class Multi21{
    public static void main(String[] args) {
        MyThreads1 m1=new MyThreads1();
        m1.start();
        MyThreads2 m2=new MyThreads2();
        m2.start();
    }
}*/

// second way 2

class Mythre1 extends Thread {
    public void run(){
        System.out.println("task111");
    }
}
class Multi21{
    public static void main(String[] args) {
        Mythre1 m1=new Mythre1();
        m1.start();
        Mythre1 m2=new Mythre1();
        m2.start();
        Mythre1 m3=new Mythre1();
        m3.start();
        Mythre1 m4=new Mythre1();
        m4.start();
    }
}