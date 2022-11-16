import GraphicalEditor.EmojiFaces.EmojiFactory;
import GraphicalEditor.EmojiFaces.HappyFactory;
import GraphicalEditor.EmojiFaces.SadFactory;
import GraphicalEditor.Renderer;

public class Main {
    public static void main(String[] args) {
        String mood = "sad";
        EmojiFactory f;
        if (mood == "happy"){
            f = new HappyFactory();
        } else {
            f = new SadFactory();
        }

        Renderer r = Renderer.getInstance();

        EmojiFace face = f.newFace();
        r.add(face);
        r.add(face.clone());
    }
}