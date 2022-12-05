package Bank.Bridge;

public class DebitCard {
    BankAccount account;

    public DebitCard(BankAccount account) {
        this.account = account;
    }
    public String pay(float amount, String target) {
        if (this.account.getBalance() < amount)
            return "Transaction unsuccessful";
        this.account.transfer(amount, target);
        return "Transaction successful";
    }

    public float getBalance() {
        return this.account.getBalance();
    }
}
