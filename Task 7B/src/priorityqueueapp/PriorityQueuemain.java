package priorityqueueapp;

public class PriorityQueuemain {
    public static void main(String[] args) {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>();
        intQueue.enqueue(4);
        intQueue.enqueue(1);
        intQueue.enqueue(3);
        intQueue.enqueue(2);
        System.out.println("Integer Queue: " + intQueue.dequeue()); // 1

        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
        doubleQueue.enqueue(3.1);
        doubleQueue.enqueue(1.5);
        doubleQueue.enqueue(2.8);
        System.out.println("Double Queue: " + doubleQueue.dequeue()); // 1.5

        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Orange");
        System.out.println("String Queue: " + stringQueue.dequeue()); // Apple
    }
}
