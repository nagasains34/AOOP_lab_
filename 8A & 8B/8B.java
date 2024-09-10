import java.util.*;
import java.util.stream.Collectors;

public class StreamPipeline {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0) // Filter even numbers
            .map(n -> n * 2)          // Double the numbers
            .collect(Collectors.toList()); // Collect into a list

        // Print the result
        result.forEach(System.out::println);
    }
}
