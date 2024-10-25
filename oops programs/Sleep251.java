public class Sleep251 extends Thread {
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i+":"+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
    public static void main(String[] args) {
        Sleep251 t1=new Sleep251();
        // t1.run();//1
         t1.start();//1 together
        Sleep251 t2=new Sleep251();
        // t2.run();//2
        t2.start();//1 together
    }

    
}
