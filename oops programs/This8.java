/*
class Test {
    int i;
    void setValues(int x){
        i=x;
    }
    void  show(){
        System.out.println(i);
    }
}
class Xyz{
    public static void main(String[] args) {
        Test t=new Test();
        t.setValues(12);
        t.show();
    }
}
 */

 class Test {
    int i;
    void setValues(int i){
       this.i=i;
    }
    void show(){
        System.out.println(i);//default value 0 and this ke baad 12
    }
 }
 class Xyz{
    public static void main(String[] args) {
        Test t=new Test();
        t.setValues(12);
        t.show();
    }
 }
