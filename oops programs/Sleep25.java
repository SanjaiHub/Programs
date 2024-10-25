//main thread ke andar sleep mathod ka use
/* 
public class Sleep25 {
    public static void main(String[] args) throws Exception{
        for (int i = 1; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }

}
*/
/* 
//second way 
public class Sleep25 {
    public static void main(String[] args){
        try{
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }    
    }
}

*/

//second program create another thread
class Mythread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            // Thread.sleep(1000); no use this method
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);


            }

            System.out.println(i);
        }
    }
}
public class Sleep25 {
    public static void main(String[] args) {
        Mythread mt=new Mythread();
        mt.start();
    }
}

