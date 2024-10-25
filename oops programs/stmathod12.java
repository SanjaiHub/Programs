/* 
//1 and 2
class Test{
    // void display(){
    //     System.out.println("1");
    // }
    static void display(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        // Test t=new Test();
        // t.display();  
       // display();//error non static method display()
       //static lagane ke baaad 
     // display(); //is tarah se static mathod ko call karwa sakte hai but within class
    
      Test.display(); 
       Xyz.show();
    

    }
}
class Xyz{
    static void show(){
        System.out.println("2");
    }
}
*/

/* 
//3 
class StaticDemo{
    // int i=12;
    static int i=12;
    static void display(){
        System.out.println(i);
    }
}
*/

/* 
//4 
class StDemo{
    static void  display(){
        show();
        System.out.println("1");
    }
    static void show(){
        System.out.println("2");
    }
}
*/

//5

/* 
class stDemo{
    int i=10;
    static void display(){
        //System.out.println(this.i);//error
    }
}
*/
    
