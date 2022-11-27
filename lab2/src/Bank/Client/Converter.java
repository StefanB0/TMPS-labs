package Bank.Client;

public class Converter {
    public int countMoney(String cash) {
        int sum = 0;
        String[] bills = cash.split(" ");
        for (String bill : bills) {
            sum += Integer.valueOf(bill);
        }
        return sum;
    }
}
