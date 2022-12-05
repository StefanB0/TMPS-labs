package Bank.Proxy;

import Bank.Bridge.BankAccount;

public interface BankInterface {
    void transfer(float amount, String target);
    void refill(float amount, String target);
    void subtract(float amount, String target);
}
