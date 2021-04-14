package wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        cashSlot.dispense(wallet, amount);
        return wallet.withdrawFromDeposit(amount);
    }
}
