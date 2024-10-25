/* 
public class joinD27 extends Thread {
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("child thread:"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);

        }

    }
    public static void main(String[] args) throws InterruptedException {
        joinD27 j=new joinD27();
        // j.run();
         j.start();
        j.join();
    
        try{
            for(int i=1;i<=5;i++){
                System.out.println("main thread:"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }  
}
*/

/*
public class joinD27 extends Thread {
    static Thread mainThread;
    public void run(){
        try{
            mainThread.join();

            for(int i=1;i<=5;i++){
                System.out.println("child thread:"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        mainThread=Thread.currentThread();
        joinD27 t=new joinD27();
        t.start();
        try{
            for(int i=1;i<=5;i++){
                System.out.println("main thread:"+i);
                Thread.sleep(100);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 */

 class Medical extends Thread{
    public void run(){
        try{
            System.out.println("Medical start");
            Thread.sleep(1000);
            System.out.println("Medical completed");

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
 }

 class TestDrive extends Thread{
    public void run(){
        try{
            System.out.println("TEst drive start");
            Thread.sleep(5000);
            System.out.println("test drive completed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
 }
 class OfficerSign extends Thread{
    public void run(){

    
    try{
        System.out.println("office takes the file");
        Thread.sleep(3000);
        System.out.println("officer work  completed");
    }
    catch(Exception e){
        System.out.println(e);
    }
}

 }
public class LicenseDemo{
    public static void main(String[] args) throws InterruptedException {
        Medical med=new Medical();
        med.start();
        med.join();//main thread wait medical ka

        TestDrive td=new TestDrive();
        td.start();
        td.join();

        OfficerSign os=new OfficerSign();
        os.start();
    }

}
 