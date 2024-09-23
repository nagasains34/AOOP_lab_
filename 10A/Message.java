import java.util.LinkedList;
import java.util.Queue;

class MessageQueue {
    private final Queue<String> queue = new LinkedList<>();
    private final int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(String message) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // Wait if the queue is full
        }
        queue.add(message);
        System.out.println("Produced: " + message);
        notifyAll(); // Notify consumers that a new message has arrived
    }

    public synchronized String consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait if the queue is empty
        }
        String message = queue.poll();
        System.out.println("Consumed: " + message);
        notifyAll(); // Notify producers that there is space in the queue
        return message;
    }
}
