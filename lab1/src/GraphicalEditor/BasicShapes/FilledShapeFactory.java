package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class FilledShapeFactory implements AbstractShapeFactory {
    @Override
    public Shape newCircle() {
        return new FilledCircle();
    }

    @Override
    public Shape newSquare() {
        return new FilledSquare();
    }

    @Override
    public Shape newTriangle() {
        return new FilledTriangle();
    }
}
