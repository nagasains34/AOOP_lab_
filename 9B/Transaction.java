class Transaction implements Runnable {
    private BankAccount account;
    private double depositAmount;
    private double withdrawAmount;

    public Transaction(BankAccount account, double depositAmount, double withdrawAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        // Perform deposit
        account.deposit(depositAmount);
        // Perform withdrawal
        account.withdraw(withdrawAmount);
    }
}
