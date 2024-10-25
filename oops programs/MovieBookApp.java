class BookTheaterSeat{

    int total_seats=10;

    void bookSeat(int seats){

        if(total_seats>=seats){
            System.out.println(seats+":seats booked successfully");
            total_seats=total_seats-seats;
            System.out.println("seat left:"+total_seats);
        }
        else{
            System.out.println("sorry seat cannot be booked..!!!!!");
            System.out.println("seats left:"+total_seats);
        }
    }
}
public class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);

    }
    public static void main(String[] args) {
        
       b=new BookTheaterSeat();
        MovieBookApp sanjay=new MovieBookApp();
        sanjay.seats=7;
        sanjay.start();

        MovieBookApp sanju=new MovieBookApp();
        sanju.seats=6;
        sanju.start();
    }
}
