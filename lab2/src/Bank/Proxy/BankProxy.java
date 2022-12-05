package Bank.Proxy;

import Bank.Bridge.BankAccount;

public class BankProxy implements BankInterface{

    BankInterface realBank;

    public BankProxy(BankInterface realBank) {
        this.realBank = realBank;
    }

    @Override
    public void transfer(float amount, String target) {
        if (amount >= 100000f) {
            System.out.println("Alert the cops");
            this.realBank.transfer(amount, "Frozen Capital");
        } else {
            this.realBank.transfer(amount, target);
        }
    }

    @Override
    public void refill(float amount, String target) {
        if (amount >= 100000f) {
            System.out.println("Alert the cops");
            this.realBank.refill(amount, "Frozen Capital");
        } else {
            this.realBank.refill(amount, target);
        }
    }

    @Override
    public void subtract(float amount, String target) {
        if (amount >= 100000f) {
            System.out.println("Alert the cops");
            this.realBank.subtract(amount, "Frozen Capital");
        } else {
            this.realBank.subtract(amount, target);
        }
    }
}
