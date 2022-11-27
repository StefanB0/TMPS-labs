package Bank.Server;

import java.util.HashMap;
import java.util.LinkedList;

public class BankNetwork {
    HashMap<String, Account> accounts;
    LinkedList<BankOffice> bankOffices;

    public BankNetwork() {
        accounts = new HashMap<>();
        bankOffices = new LinkedList<>();
    }

    public void addAccount(String name, int initialDeposit) {
        Account account = new Account();
        account.transfer(initialDeposit);

        accounts.put(name, account);
    }

    public void addOffice(int initialDeposit) {
        BankOffice bank = new BankOffice();
        bank.deposit(initialDeposit);

        bankOffices.add(bank);
    }

    public int checkBalance(String name) {
        return accounts.get(name).getBalance();
    }
    public void addToBalance(String name, int amount) {
        accounts.get(name).transfer(amount);
    }

}
