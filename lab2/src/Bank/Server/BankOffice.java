package Bank.Server;

public class BankOffice {
    int treasury = 0;

    int getBalance() {
        return this.treasury;
    }

    String deposit(int amount){
        this.treasury += amount;
        return "Transation successful";
    }

    String subtract(int amount){
        if (this.treasury < amount)
            return "Not enough funds";
        this.treasury -= amount;
        return "Transation successful";
    }
}
