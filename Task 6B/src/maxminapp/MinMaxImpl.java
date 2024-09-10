package maxminapp;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
    public T min(T[] arr) {
        T min = arr[0];
        for (T element : arr) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T max(T[] arr) {
        T max = arr[0];
        for (T element : arr) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
