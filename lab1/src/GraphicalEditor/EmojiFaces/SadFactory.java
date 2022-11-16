package GraphicalEditor.EmojiFaces;

public class SadFactory implements EmojiFactory{
    @Override
    public EmojiFace newFace() {
        return new SadFace();
    }
}
