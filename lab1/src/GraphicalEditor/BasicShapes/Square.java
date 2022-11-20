package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class Square implements Shape {
    @Override
    public Shape clone() {
        return this;
    }

    @Override
    public String render() {
        return "□";
    }
}

class DottedSquare extends Square {
    @Override
    public String render() {
        return "⊡";
    }
}

class FilledSquare extends Square {
    @Override
    public String render() {
        return "■";
    }
}
