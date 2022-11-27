package Bank.Client;

import Bank.Server.BankNetwork;

public class ATM {
    Converter c;
    BankNetwork network;

    public ATM(BankNetwork network) {
        this.network = network;
        this.c = new Converter();
    }

    public void refill(String name, String bills){
        int amount = c.countMoney(bills);
        network.addToBalance(name, amount);
    }
}
