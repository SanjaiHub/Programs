class Test extends Thread{
    public void run(){  

        //jab thread intrrucpt nahi hua hai to dono false output provide kar rahe h

         System.out.println("B1"+Thread.currentThread().isInterrupted());//false ,true
         System.out.println("B2"+Thread.currentThread().isInterrupted());//false ,true
        
        //   System.out.println("S1:"+Thread.interrupted());//false{flase<-true},true
        //   System.out.println("S2:"+Thread.interrupted());//false{flase<-true},false

        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println("N:"+Thread.interrupted());

            }
        }
        catch(Exception e)
        {
            System.out.println("thread interruted"+e);
        }
    }

}
public class IntrrupIsint281 {
    public static void main(String[] args) {
        Test t=new Test();
        t.start();
         t.interrupt();
    }
    
}
