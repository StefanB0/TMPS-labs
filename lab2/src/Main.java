import Bank.Client.ATM;
import Bank.Server.BankNetwork;

public class Main {
    public static void main(String[] args) {
        BankNetwork trustyMoney = new BankNetwork();
        trustyMoney.addOffice(1000000);
        trustyMoney.addAccount("Ana",100);
        ATM atm1 = new ATM(trustyMoney);
        atm1.refill("Ana", "100 20 20 20 20 20");
        int m = trustyMoney.checkBalance("Ana");
        System.out.println(m);
    }
}