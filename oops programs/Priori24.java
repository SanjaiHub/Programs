public class Priori24 extends Thread{
    public void run(){
        System.out.println("child thread");
        System.out.println("child thread:"+Thread.currentThread().getPriority());//refer to parent nature
    }


    public static void main(String[] args) {
        System.out.println("main thread old priority:"+Thread.currentThread().getPriority());//by default 5
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("main thread new priority:"+Thread.currentThread().getPriority());
        Priori24 p=new Priori24();
        // p.setPriority(3);
        p.start();
    }
    
}
