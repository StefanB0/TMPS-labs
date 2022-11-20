package GraphicalEditor;

import java.util.LinkedList;

// singleton
public class Renderer {
    LinkedList<Shape> memory;

    private static final Renderer instance = new Renderer();

    private Renderer(){
        this.memory = new LinkedList<>();
    }

    public static Renderer getInstance() {
        return instance;
    }
    public int add(Shape shape) {
        memory.add(shape);
        return 0;
    }

    public int draw() {
        String output = "Draw: ";
        for(Shape s: this.memory) {
            output += s.render() + ", ";
        }
        output = output.substring(0, output.length()-2);
        System.out.println(output);
        return 0;
    }
}
