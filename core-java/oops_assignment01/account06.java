class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class account06 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123", 1000);

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println(acc.getBalance());

        // acc.balance = 10000 not support
    }
}
