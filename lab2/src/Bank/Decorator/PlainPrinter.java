package Bank.Decorator;

public class PlainPrinter implements Printer{
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
