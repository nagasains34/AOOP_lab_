import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinter {
    private static final Object lock = new Object();
    private static int currentNumber = 1;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        // Create and start threads
        executor.execute(NumberPrinter::printTwo);
        executor.execute(NumberPrinter::printThree);
        executor.execute(NumberPrinter::printFour);
        executor.execute(NumberPrinter::printFive);
        executor.execute(NumberPrinter::printNumber);
        
        executor.shutdown();
    }

    public static void printTwo() {
        for (int i = 1; i <= 15; i++) {
            synchronized (lock) {
                if (i % 2 == 0) {
                    System.out.println("Divisible by 2: " + i);
                }
            }
        }
    }

    public static void printThree() {
        for (int i = 1; i <= 15; i++) {
            synchronized (lock) {
                if (i % 3 == 0) {
                    System.out.println("Divisible by 3: " + i);
                }
            }
        }
    }

    public static void printFour() {
        for (int i = 1; i <= 15; i++) {
            synchronized (lock) {
                if (i % 4 == 0) {
                    System.out.println("Divisible by 4: " + i);
                }
            }
        }
    }

    public static void printFive() {
        for (int i = 1; i <= 15; i++) {
            synchronized (lock) {
                if (i % 5 == 0) {
                    System.out.println("Divisible by 5: " + i);
                }
            }
        }
    }

    public static void printNumber() {
        for (int i = 1; i <= 15; i++) {
            synchronized (lock) {
                if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0) {
                    System.out.println("Number: " + i);
                }
            }
        }
    }
}
