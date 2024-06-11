package exception2;

public class PaymentService extends BookTickets {
    public  int ticketPrice=100;
    public int totalTicketPrice;
    public int balance;

    public PaymentService(String userName, String password, int noOfSeats,  int balance) {
        super(userName, password, noOfSeats);

        this.balance = balance;
    }
    public void payment() throws InsufficentBalance{
        totalTicketPrice=noOfSeats*ticketPrice;
        if(totalTicketPrice<=balance){
            int remainingbalance=balance-totalTicketPrice;
            System.out.println("price"+totalTicketPrice);
            System.out.println("remaining balance" +remainingbalance);
        }else{
            throw new InsufficentBalance(ErrorCodes.InsufficentBalance.getCode(), ErrorCodes.InsufficentBalance.getMessage());
        }
    }
}
