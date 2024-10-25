//deamon thread
public class Deamont23 extends Thread{
    public void run(){
        System.out.println("Deamon thread");

        // if(Thread.currentThread().isDaemon()){
        //     System.out.println("Deamon thread");

        // }
        // else{
        //     System.out.println("child thread");
        // }

    }
    public static void main(String[] args) {
        System.out.println("main thread");
        Deamont23 dm=new Deamont23();
        dm.setDaemon(true);
        dm.start();
        // dm.setDaemon(true);//exception
    }
}
