package support;

import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    private Queue<String> tickets = new LinkedList<>();

    public void addTicket(String ticket) {
        tickets.offer(ticket);
    }

    public void processNextTicket() {
        if (!tickets.isEmpty()) {
            tickets.poll();
        }
    }

    public void displayPendingTickets() {
        int index = 1;
        for (String ticket : tickets) {
            System.out.println(index++ + ". " + ticket);
        }
    }
}
