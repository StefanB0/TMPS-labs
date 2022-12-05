package Bank.Adapter;

public interface MutableDocument {
    String name();
    String contents();
    void modify(String newContents);

    long lastModified();
}
