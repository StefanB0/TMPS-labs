import Bank.Adapter.WordAdapter;
import Bank.Adapter.WordDocument;
import Bank.Bridge.AgroBankAccount;
import Bank.Bridge.BankAccount;
import Bank.Bridge.DebitCard;
import Bank.Server.Client.ATM;
import Bank.Composite.Hotel;
import Bank.Composite.Tourist;
import Bank.Composite.TouristGroup;
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

        // New version
        // Adapter
        WordDocument doc1 = new WordDocument("Very important document", "password = 12345");
        WordAdapter doc1PDF = new WordAdapter(doc1);
        System.out.println("Document Contents: " + doc1PDF.body());

        // Bridge
        AgroBankAccount acc1 = new AgroBankAccount();
        acc1.refill(100);
        DebitCard card1 = new DebitCard(acc1);
        card1.pay(50, "AgroShop");
        System.out.println("Card balance " + card1.getBalance());

        // Composite
        BankAccount JohnAcc = new AgroBankAccount();
        JohnAcc.refill(1024.65f);
        DebitCard JohnCard = new DebitCard(JohnAcc);
        Tourist John = new Tourist(JohnCard);

        BankAccount RoseAcc = new AgroBankAccount();
        JohnAcc.refill(944.17f);
        DebitCard RoseCard = new DebitCard(JohnAcc);
        Tourist Rose = new Tourist(JohnCard);

        TouristGroup couple = new TouristGroup();
        couple.addMember(John);
        couple.addMember(Rose);

        Hotel MaldiviHotel = new Hotel("Maldivi Hotel", 199.99f);
        MaldiviHotel.lendRoom(couple, 2);
        System.out.println("Couple balances after paying" + String.valueOf(John.getBalance() + Rose.getBalance()));

        // Decorator

        // Proxy
    }
}