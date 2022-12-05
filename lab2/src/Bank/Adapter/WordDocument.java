package Bank.Adapter;

public class WordDocument implements MutableDocument{
    String name, contents;
    long lastModified;

    public WordDocument(String name, String contents) {
        this.name = name;
        this.contents = contents;
        this.lastModified = System.currentTimeMillis();
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String contents() {
        return this.contents;
    }

    @Override
    public void modify(String newContents) {
        this.contents = newContents;
        this.lastModified = System.currentTimeMillis();
    }

    @Override
    public long lastModified() {
        return this.lastModified;
    }
}
