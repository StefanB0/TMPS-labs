package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class DefaultShapeFactory implements AbstractShapeFactory {

    @Override
    public Shape newCircle() {
        return new Circle();
    }

    @Override
    public Shape newSquare() {
        return new Square();
    }

    @Override
    public Shape newTriangle() {
        return new Triangle();
    }
}
