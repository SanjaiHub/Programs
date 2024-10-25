/*

import java.io.FileInputStream;

class Test{
    public static void main(String[] args) {
        try{
        FileInputStream fis=new FileInputStream("d:/abc.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("hello");

    }
} */

//runtime excp.
/* 
class Test {
    public static void main(String[] args) {
        try{
        int a=100,b=0,c;
        c=a/b;
        System.out.println(c);
        }
        catch(Exception e){
            // System.out.println(e);//print object
            System.out.println("you cannot devided by zero");//manually

        }
        System.out.println("hi k");
    }
} */

/* 
class Test{
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            int a=100,b=2,c;
            System.out.println("3");
            c=a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
        }
        catch(ArithmeticException e){
            System.out.println("6");
            System.out.println(e);
            System.out.println("7");

        }
        System.out.println("hello s");
    }
} */

class Test{
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            int a=100,b=0,c;
            System.out.println("3");
            c=a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
        }
        catch(ArithmeticException e){
            System.out.println("6");
            // System.out.println(e);//object ki values
            System.out.println("you cannot devide");
            System.out.println("7");

        }
        System.out.println("hello s");
    }
}

