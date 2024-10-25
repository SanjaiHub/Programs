abstract class Vehicle{
    abstract void start();//abstract method 
    
}
class Car extends Vehicle{
    void start(){//body compl.
        System.out.println("car starts with key");
    }

}
class Scooter extends Vehicle{
    void start(){//body compl.
        System.out.println("Scooter starts with kick");
    }
    public static void main(String[] args) {
        // Vehicle v=new Vehicle();
        Car c=new Car();
        c.start();
        Scooter s=new Scooter();
        s.start();
    }
}
