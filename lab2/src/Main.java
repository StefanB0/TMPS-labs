import Bank.Adapter.WordAdapter;
import Bank.Adapter.WordDocument;
import Bank.Bridge.AgroBankAccount;
import Bank.Bridge.BankAccount;
import Bank.Bridge.DebitCard;
import Bank.Decorator.ColoredPrinter;
import Bank.Decorator.PlainPrinter;
import Bank.Proxy.AgroBank;
import Bank.Proxy.BankProxy;
import Bank.Server.Client.ATM;
import Bank.Composite.Hotel;
import Bank.Composite.Tourist;
import Bank.Composite.TouristGroup;
import Bank.Server.BankNetwork;

public class Main {
    public static void main(String[] args) {
        // New version
        AgroBank agroBank = new AgroBank();

        // Adapter
        System.out.println("Adapter");
        WordDocument doc1 = new WordDocument("Very important document", "password = 12345");
        WordAdapter doc1PDF = new WordAdapter(doc1);
        System.out.println("\tDocument Contents: " + doc1PDF.body());

        // Bridge
        System.out.println("Bridge");
        BankAccount acc1 = agroBank.createAccount("acc1");
        acc1.refill(100f);
        DebitCard card1 = agroBank.issueCard("acc1");
        card1.pay(50f, "AgroShop");
        System.out.println("\tCard balance " + card1.getBalance());

        // Composite
        System.out.println("Composite");
        BankAccount JohnAcc = agroBank.createAccount("John");
        JohnAcc.refill(1024.65f);
        DebitCard JohnCard = agroBank.issueCard("John");
        Tourist John = new Tourist(JohnCard);

        BankAccount RoseAcc = agroBank.createAccount("Rose");
        RoseAcc.refill(944.17f);
        DebitCard RoseCard = agroBank.issueCard("Rose");
        Tourist Rose = new Tourist(RoseCard);

        TouristGroup couple = new TouristGroup();
        couple.addMember(John);
        couple.addMember(Rose);

        Hotel MaldiviHotel = new Hotel("Maldivi Hotel", 199.99f);
        agroBank.createAccount("Maldivi Hotel");
        MaldiviHotel.lendRoom(couple, 2);
        System.out.println("\tCouple balances after paying " + String.valueOf(John.getBalance() + Rose.getBalance()));

        // Decorator
        System.out.println("Decorator");
        PlainPrinter pr1 = new PlainPrinter();
        ColoredPrinter pr2 = new ColoredPrinter(pr1);
        pr2.print("\tHello World");

        // Proxy
        System.out.println("Proxy");
        agroBank.createAccount("Frozen Capital");
        agroBank.createAccount("Criminal");
        BankProxy proxy = (BankProxy) agroBank.getProxy();
        proxy.refill(1000000f, "Criminal");
    }
}