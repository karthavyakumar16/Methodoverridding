package exception2;

public class BookTickets extends LoginProcess {
    public int noOfSeats;

    public int totalNoOFSeats =10;

    public BookTickets(String userName, String password, int noOfSeats) {
        super(userName, password);
        this.noOfSeats = noOfSeats;
    }

    public void seats() throws InvalidInput {
        if (noOfSeats <= totalNoOFSeats)  {
           int remainingSeats=totalNoOFSeats-noOfSeats;
            System.out.println("no of seats"+noOfSeats);
            System.out.println("remaining"+remainingSeats);
        } else {
            throw new InvalidInput(ErrorCodes.InvalidInput.getCode(),ErrorCodes.InvalidInput.getMessage());

        }
    }
}