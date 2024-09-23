public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create multiple transactions
        Thread user1 = new Thread(new Transaction(account, 1000, 500));
        Thread user2 = new Thread(new Transaction(account, 1500, 700));
        Thread user3 = new Thread(new Transaction(account, 2000, 800));
        Thread user4 = new Thread(new Transaction(account, 2500, 1200));

        // Start the threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();

        // Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Final balance
        System.out.println("Final Account Balance: " + account.getBalance());
    }
}
