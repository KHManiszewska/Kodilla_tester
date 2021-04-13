package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public boolean withdrawFromDeposit(int money) {
        if (this.balance >= money) {
            this.balance -= money;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }

}
