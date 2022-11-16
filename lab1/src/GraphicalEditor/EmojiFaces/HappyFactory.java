package GraphicalEditor.EmojiFaces;

public class HappyFactory implements EmojiFactory{

    @Override
    public EmojiFace newFace() {
        return new HappyFace();
    }
}
