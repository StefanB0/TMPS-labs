package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class DottedShapeFactory implements AbstractShapeFactory {

    @Override
    public Shape newCircle() {
        return new DottedCircle();
    }

    @Override
    public Shape newSquare() {
        return new DottedSquare();
    }

    @Override
    public Shape newTriangle() {
        return new SmallTriangle();
    }
}
