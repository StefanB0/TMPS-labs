package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class Triangle implements Shape {
    @Override
    public Shape clone() {
        return null;
    }
}

class DottedTriangle extends Triangle {

}

class FilledTriangle extends Triangle {

}