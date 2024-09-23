class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    // Synchronized method to ensure thread safety for deposits
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Synchronized method to ensure thread safety for withdrawals
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}
