package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public String withdrawFromDeposit(int money) {
        if (this.balance >= money) {
            this.balance -= money;
            return "You have enough money in your wallet";
        }
        return "You don't have enough money in your wallet";
    }

    public int getBalance() {

        return balance;
    }

    public String displayBalance() {
        String display = "the balance of yor wallet is: $" + balance;
        System.out.println(display);
        return display;
    }
}
