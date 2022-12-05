package Bank.Bridge;

public interface BankAccount {
    float getBalance();
    void transfer(float amount, String target);
    void subtract(float amount);
    void refill(float amount);
}
