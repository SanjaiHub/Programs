/* 
public class ThreadMethod22 {
    public static void main(String[] args) {
        System.out.println("hello");
        // System.out.println(Thread.currentThread().getName());//thread name by default "main" create by jvm
        // Thread.currentThread().setName("Sanju");
        // System.out.println("new thread name : " + Thread.currentThread().getName());
        Thread.currentThread().setName("sanjay");//main thread ka name 

        System.out.println(10/0);
        
    }
    
}
*/
class Test extends Thread{
    public void run(){
        // Thread.currentThread().setName("Sanju");
        System.out.println("Thread is exeuted by:"+Thread.currentThread().getName());//thread-0
    }
}
public class ThreadMethod22{
    public static void main(String[] args) {
        System.out.println("Hello is printed by:"+Thread.currentThread().getName());//main
        Test t1=new Test();
        // t1.setName("sanju");
        t1.start();
      // System.out.println( Thread.currentThread().isAlive());//true
       System.out.println(t1.isAlive());//true
    }

}