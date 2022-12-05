package Bank.Decorator;

public class ColoredPrinter extends PrinterDecorator{
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public ColoredPrinter(Printer wrapee) {
        super(wrapee);
    }

    public void print(String text) {
        this.wrapee.print(text);
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }
}
