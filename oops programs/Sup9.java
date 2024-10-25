class A { 
    int a=10;
}
class B extends A{
    int a=12;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        B s=new B();
        s.show(20);
    }

}
