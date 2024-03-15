package bookingticket;

public class Test {
    public static void main(String[] args) {
        Login login = new Login();
        boolean user = login.login("12345", "5421");


        if (user == true) {
            System.out.println("Login Succesfull");
            MovieTicket ticket = new MovieTicket("gammi", "neo", "9:30");
            System.out.println(ticket);
            CounterBooking ticket1 = new CounterBooking("gammi", "neo", "9:30", 2);
            int cost = ticket1.dispalyTicket(3);
            System.out.println(cost);
            System.out.println(ticket1);
            MovieTicket ticket2 = new OnlineBooking("opretion", "malii", "8:30", "4");
            System.out.println(ticket2);
            System.out.println(ticket2.getTheatreName());
        } else {
            System.out.println("Login failed");
        }

    }
}

