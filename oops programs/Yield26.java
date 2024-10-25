public class Yield26 extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        Yield26 t1 = new Yield26();
        t1.start();
        //  Thread.yield();//if you want main method to stop and provide chance to other thread for execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread=" + i);
        }
    }

}
