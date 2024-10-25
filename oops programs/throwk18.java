//throw keyword ka program
/*
import java.util.Scanner;
class YoungerAgeException extends RuntimeException{//customized Exception class create or unchecked exception
    YoungerAgeException(String msg){//non paramitrazed cunstructor also create
        super(msg);
    }
}
class Voting{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age :");
        int age =s.nextInt();
        if (age<18) {
            throw new YoungerAgeException("you are not eligible  for voting");  //exception object ki need hai so create a object 
            
        }
        else{
            System.out.println("you can vote successfully");
        }
        System.out.println("hello");//program abnormaly terminate without exception handle
    }
}
*/

//handle exception using try and catch keyword
import java.util.Scanner;
class YoungerAgeException extends RuntimeException{//customized Exception class create or unchecked exception
    YoungerAgeException(String msg){//non paramitrazed cunstructor also create
        super(msg);
    }
}
class Voting{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age :");
        int age =s.nextInt();
        try{
        if (age<18) {
            throw new YoungerAgeException("you are not eligible  for voting");  //exception object ki need hai so create a object 
            //programmer ne manually excep. object create hai us obj. ko catch block handle kar lega aur detials prin kar wa deg aur aage bhi program execute hota rahega  
            // System.out.println("shffhflleg"); //compile hi nahi hoga
        }
        else{
            System.out.println("you can vote successfully");
        }
    }
    catch(YoungerAgeException ye){
        ye.printStackTrace();
    }
        System.out.println("hello");//program abnormaly terminate without exception handle but now not abnormaly ternimate program
    }
}

