package wallet;

import org.junit.Assert;
import io.cucumber.java8.En;

public class WalletSteps implements En {
    private String answer;
    private String alert;
    private int balance;
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {

        Given("I have deposited $1200 in my wallet", () -> {

            wallet.deposit(1200);
            Assert.assertEquals("Incorrect wallet balance", 1200, wallet.getBalance());

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
       });

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        // **********************

        Given("there is $400 in my wallet", () -> {
            wallet.deposit(400);
        });

        When("I check the balance of my wallet", () -> {
            this.balance = wallet.getBalance();
            Assert.assertEquals("Incorrect wallet balance", 400, wallet.getBalance());
        });

        Then("I should see that the balance is $400", () -> {
             this.answer = wallet.displayBalance();
             Assert.assertEquals("the balance of yor wallet is: $"+this.balance, this.answer);
        });

        // **********************

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            this.alert = cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You don't have enough money in your wallet",  this.alert);
        });
    }
}
