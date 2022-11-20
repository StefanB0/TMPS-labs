import GraphicalEditor.AdvancedShapes.CubeBuilder;
import GraphicalEditor.AdvancedShapes.Shape3D;
import GraphicalEditor.AdvancedShapes.Shape3DBuilder;
import GraphicalEditor.BasicShapes.AbstractShapeFactory;
import GraphicalEditor.BasicShapes.Circle;
import GraphicalEditor.BasicShapes.FilledShapeFactory;
import GraphicalEditor.EmojiFaces.EmojiFace;
import GraphicalEditor.EmojiFaces.EmojiFactory;
import GraphicalEditor.EmojiFaces.HappyFactory;
import GraphicalEditor.EmojiFaces.SadFactory;
import GraphicalEditor.Renderer;

public class Main {
    public static void main(String[] args) {
        Renderer r = Renderer.getInstance();

        String mood = "sad";
        EmojiFactory f;
        if (mood == "happy"){
            f = new HappyFactory();
        } else {
            f = new SadFactory();
        }
        EmojiFace face = f.newFace();

        AbstractShapeFactory shapefactory = new FilledShapeFactory();
        Circle simpleCircle = (Circle) shapefactory.newCircle();

        Shape3DBuilder builder = new CubeBuilder();
        builder.reset();
        builder.setCoordinates(22, 19);
        builder.setSize(42);
        builder.setTexture("Zebra colored");
        Shape3D complexShape = builder.getResult();

        r.add(face);
        r.add(face.clone());
        r.add(simpleCircle);
        r.add(complexShape);

        r.draw();
    }
}