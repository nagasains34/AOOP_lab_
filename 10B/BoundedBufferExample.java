import java.util.LinkedList;

class BoundedBuffer {
    private final LinkedList<Integer> buffer;
    private final int capacity;

    public BoundedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait if the buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify consumers that an item has been produced
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait if the buffer is empty
        }
        int item = buffer.removeFirst();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify producers that an item has been consumed
        return item;
    }
}

class Producer extends Thread {
    private final BoundedBuffer buffer;

    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                buffer.produce(i);
                Thread.sleep(100); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class BoundedBufferExample {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        
        producer.start();
        consumer.start();
    }
}
