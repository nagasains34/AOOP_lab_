public class MessagingApp {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue(5); // Queue capacity of 5

        Producer producer = new Producer(messageQueue);
        Consumer consumer = new Consumer(messageQueue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
