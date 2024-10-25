/* 
//final keyword with variable
class Test{
    public static void main(String[] args) {
     final int i=12;
       // i=i+12; //Compile time- error cannot assign a value to final variable i
        System.out.println(i);
    }
}
*/

/*
//2.final with mathod //use overriding concept
class Demo{
    final void m1(){
        System.out.println("i m in class Demo");
    }
}
class Test extends Demo{
    // void m1(){ //compile time error: cannot oerride m1()
    //     System.out.println("i am in class Test");
    // }
    public static void main(String[] args) {
        
    }
} 
*/

/* 
//3.with class 

final class Demo{
    -=  
}
class Test extends Demo{ //error cannot inherit Demo class 
    public static void main(String[] args) {
        
    }
}*/