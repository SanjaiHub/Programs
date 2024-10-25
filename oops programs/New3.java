public class New3 {
    //CONSTRUCTOR

     /* 
    //1. Default constuctor 
    int i;
    string s;
    public static void main(String[] args) {
        New3 t=new New3();
        System.out.println(t.i+"and"+t.s);//by compile create default constructor and print default value= 0 and null;
    }
    */

    /* 
    //2.No argument constructor or user defind cons.
    
    New3(){
        System.out.println("No arg const");

    }
    public static void main(String[] args) {
        New3 t=new New3();//no parametor pass 
        
    }*/

    //Parametrized const.

    New3(int a){
        System.out.println("Parametrized const");
    }
    public static void main(String[] args) {
        New3 t =new New3(10);// pass parametor
        
    }


}
