package Bank.Decorator;

public class PrinterDecorator implements Printer{
    Printer wrapee;

    public PrinterDecorator(Printer wrapee) {
        this.wrapee = wrapee;
    }
    @Override
    public void print(String text) {
        this.wrapee.print(text);
    }
}
