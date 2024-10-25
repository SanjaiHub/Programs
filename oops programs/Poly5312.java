//3.Overriding and Exception Handling
// RULE 1
/*class Test {
    void show() {
        System.out.println("1 ");

    }

}

class Xyz extends Test { //RULE-1
    void show() throws ArithmeticException//checked exp.=Exception × // ArithmeticException ✔ //unchecked exception
     {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        Xyz x = new Xyz();
        x.show();
    }
}
*/

// RULE-2
class Test {
    void show() throws RuntimeException{
        System.out.println("1 ");

    }

}

class Xyz extends Test { //RULE-1
    void show() throws ArithmeticException//RuntimeException //Exception ×
    {
     {
        System.out.println("2");
    }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        Xyz x = new Xyz();
        x.show();
    }
}

