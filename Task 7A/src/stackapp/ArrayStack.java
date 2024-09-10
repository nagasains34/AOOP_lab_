package stackapp;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayStack() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void push(T item) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) array[--size];
        array[size] = null;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
