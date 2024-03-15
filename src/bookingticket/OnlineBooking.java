package bookingticket;

public class OnlineBooking extends MovieTicket {
    public String bookingCode;

    public OnlineBooking(String movieName, String theatreName, String showTime, String bookingCode) {
        super(movieName, theatreName, showTime);
        this.bookingCode = bookingCode;
    }

   public void displayTicket(){
        System.out.println(bookingCode);
   }
}
