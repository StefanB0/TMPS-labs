package Bank.Server;

class Account {
    int balance;

    Account(){
        this.balance = 0;
    }

    String transfer(int amount) {
        if (amount <= 0)
            return "Errror, transfer amount must be positive";
        this.balance += amount;
        return "Transation successful";
    }

    String subtract(int amount) {
        if (amount > this.balance)
            return "Error, not enough balance";
        this.balance -= amount;
        return "Transation successful";
    }

    int getBalance() {
        return this.balance;
    }
}
