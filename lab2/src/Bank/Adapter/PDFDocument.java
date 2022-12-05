package Bank.Adapter;

public class PDFDocument implements ImmutableDocument {
    String name, body;

    public PDFDocument(String name, String body) {
        this.name = name;
        this.body = body;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String body() {
        return this.body;
    }
}
