class Test{
    public static void main(String[] args) {
        try{
        int a=100,b=0,c;
        c=a/b;
        System.out.println(c);
        }
        catch(ArithmeticException ae){
            // ae.printStackTrace();//1. method print excep. Name ,desc.,stack trace
            // System.out.println(ae); //2. method not print stack trace
            System.out.println(ae.toString());
            // System.out.println(ae.getMessage());//3. method only print description


        }
        System.out.println("hi sanjay");
    }
}