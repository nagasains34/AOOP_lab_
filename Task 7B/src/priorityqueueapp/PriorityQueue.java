package priorityqueueapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue<T extends Comparable<T>> {
    private List<T> elements = new ArrayList<>();

    public void enqueue(T element) {
        elements.add(element);
        Collections.sort(elements);
    }

    public T dequeue() {
        if (isEmpty()) return null;
        return elements.remove(0);
    }

    public T peek() {
        if (isEmpty()) return null;
        return elements.get(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
