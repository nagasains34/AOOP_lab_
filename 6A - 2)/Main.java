import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream pipeline to filter, double, and collect
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 == 0)    // Filter even numbers
                                      .map(n -> n * 2)            // Double the even numbers
                                      .collect(Collectors.toList()); // Collect into a list

        System.out.println(result);
    }
}
