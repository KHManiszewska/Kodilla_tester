package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public String withdrawFromDeposit(int money) {
        String display = "You have enough money in your wallet";
        if (this.balance >= money) {
            this.balance -= money;
            return display;
        }
        display = "You don't have enough money in your wallet";
        System.out.println(display);
        return display;
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
