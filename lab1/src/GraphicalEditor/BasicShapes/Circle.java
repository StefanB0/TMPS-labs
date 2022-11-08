package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class Circle implements Shape {
    @Override
    public Shape clone() {
        return null;
    }
}

class DottedCircle extends Circle {

}

class FilledCircle extends Circle {

}
