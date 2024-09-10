package support;

public class Main {
    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();
        ticketQueue.addTicket("Ticket 1: Login issue");
        ticketQueue.addTicket("Ticket 2: Payment not processed");
        ticketQueue.addTicket("Ticket 3: Error on checkout");
        ticketQueue.displayPendingTickets();
        ticketQueue.processNextTicket();
        ticketQueue.displayPendingTickets();
    }
}
