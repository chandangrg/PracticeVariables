package practiceVariable;

class MovieTicket {
    static int totalTicketsSold = 0;

    public MovieTicket() {
        totalTicketsSold++;
        System.out.println("Ticket booked! Total tickets sold: " + totalTicketsSold);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket();
        MovieTicket t3 = new MovieTicket();
    }
}