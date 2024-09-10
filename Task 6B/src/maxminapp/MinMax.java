package maxminapp;

public interface MinMax<T extends Comparable<T>> {
    T min(T[] arr);
    T max(T[] arr);
}
