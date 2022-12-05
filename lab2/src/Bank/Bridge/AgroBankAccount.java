package Bank.Bridge;

public class AgroBankAccount implements BankAccount {

    public String accountId;
    private float balance;
    @Override
    public float getBalance() {
        return this.balance;
    }

    @Override
    public void transfer(float amount, String target) {
        this.balance -= amount;
        // Send to target via Proxy
        if (target == "AgroShop")
            this.balance += amount * 0.05;
    }

    @Override
    public void subtract(float amount) {
        this.balance -= amount;
    }

    @Override
    public void refill(float amount) {
        this.balance += amount;
    }
}
