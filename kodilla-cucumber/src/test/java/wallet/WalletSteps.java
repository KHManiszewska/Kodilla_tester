package wallet;

import org.junit.Assert;
import io.cucumber.java8.En;

public class WalletSteps implements En {
    private String answer;
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());

        });

        Given("I have deposited $30 in my wallet", () -> {
            wallet.deposit(30);
            Assert.assertEquals("Incorrect wallet balance", 30, wallet.getBalance());
        });

        Given("I have deposited $10 in my wallet", () -> {
            wallet.deposit(10);
            Assert.assertEquals("Incorrect wallet balance", 10, wallet.getBalance());
        });

        Given("I have deposited $0 in my wallet", () -> {
            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        When("I requested $30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("The {string} should be dispensed", (String string) -> {
            int slotValue = cashSlot.getContents();
            System.out.println(slotValue);
            this.answer = String.valueOf(slotValue);
            Assert.assertEquals("Incorrect slot dispensed", string, this.answer);
            // Assert.assertEquals(string, this.answer);
        });
    }
}
