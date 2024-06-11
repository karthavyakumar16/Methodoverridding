package ticket112;

import java.util.Date;

public class TicketService {
    Ticket bookTicket1(Row[] row, int money, String movieName, Date date){
        Row row1=new Row();
        row1.rowNumber="4";
        row1.seatNumber=new int[]{3,6};

        Row row2=new Row();
        row2.rowNumber="5";
        row2.seatNumber=new int[]{4,5};

        Row row3=new Row();
        row3.rowNumber="6";
        row3.seatNumber=new int[]{8,9};

        Ticket ticket=new Ticket();
        ticket.name=movieName;
        ticket.time=date;
        return ticket;
    }
}
