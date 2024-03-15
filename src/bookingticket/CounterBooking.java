package bookingticket;

public class CounterBooking  extends MovieTicket{
    public int noOfSeats;

    public CounterBooking(String movieName, String theatreName, String showTime, int noOfSeats) {
        super(movieName, theatreName, showTime);
        this.noOfSeats = noOfSeats;
    }
public int dispalyTicket(){
        return noOfSeats;
}
public int dispalyTicket(int ticketprice){
        System.out.println("no of seats"+noOfSeats);
        ticketprice=150*noOfSeats;
        return ticketprice;
}

}
