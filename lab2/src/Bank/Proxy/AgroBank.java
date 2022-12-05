package Bank.Proxy;

import Bank.Bridge.AgroBankAccount;
import Bank.Bridge.BankAccount;
import Bank.Bridge.DebitCard;

import java.util.HashMap;

public class AgroBank implements BankInterface{
    HashMap<String, BankAccount> accounts;
    BankProxy bankProxy;

    public AgroBank() {
        this.accounts = new HashMap<>();
        this.bankProxy = new BankProxy(this);
    }

    public BankInterface getProxy() {
        return this.bankProxy;
    }

    public BankAccount createAccount(String name) {
        accounts.put(name, new AgroBankAccount(bankProxy));
        return accounts.get(name);
    }

    public DebitCard issueCard(String holderName) {
        return new DebitCard(accounts.get(holderName));
    }

    @Override
    public void transfer(float amount, String target) {
        accounts.get(target).refill(amount);
    }

    @Override
    public void refill(float amount, String target) {
        accounts.get(target).refill(amount);
    }

    @Override
    public void subtract(float amount, String target) {
        accounts.get(target).subtract(amount);
    }
}
