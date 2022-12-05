package Bank.Adapter;

public class WordAdapter implements ImmutableDocument{
    private MutableDocument wordDocument;

    public WordAdapter(MutableDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    @Override
    public String name() {
        return wordDocument.name();
    }

    @Override
    public String body() {
        return wordDocument.contents();
    }
}
