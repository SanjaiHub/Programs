/* 
//no exception occur = try and finally block is execute
class Test{
    public static void main(String[] args) {
        try{
            int a=100, b=2,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException  e){
            System.out.println(e);

        }
        finally{
            System.out.println("i am in finally block");
        }
        
    }
}*/

/* 
//when exception is occur then try , catch and finally block are excute
class Test{
    public static void main(String[] args) {
        try{
            int a=100, b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException  e){
            System.out.println(e);

        }
        finally{
            System.out.println("i am in finally block");
        }
        
    }
}
*/

/*
//without catch block= no in exception occur case 
class Test{
    public static void main(String[] args) {
        try{
            int a=100, b=2,c;
            c=a/b;
            System.out.println(c);
        }
        finally{
            System.out.println("i am in finally block");
        }
        // System.out.println("ssjd");
    }    

} */

//without catch block = when exception is occur
//first of all execute finally block then abnormaly terminate an  print exception name,desc,stack trace

class Test{
    public static void main(String[] args) {
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        finally{
            System.out.println("i am in finally block");
        }
        System.out.println("this is lst op");//not execute
    }
}

