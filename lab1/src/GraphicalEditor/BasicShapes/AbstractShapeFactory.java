package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public interface AbstractShapeFactory {
    public Shape newCircle();
    public Shape newSquare();
    public Shape newTriangle();
}

