public class Intrrup28 extends Thread {
     public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Thread intrrupted="+e);
        }

     }
     public static void main(String[] args) {
        Intrrup28 i=new Intrrup28();
        i.start();
        i.interrupt();
     }

    
}
