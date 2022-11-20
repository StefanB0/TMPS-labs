package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class Circle implements Shape {
    @Override
    public Shape clone() {
        return this;
    }

    @Override
    public String render() {
        return "○";
    }
}

class DottedCircle extends Circle {
    @Override
    public String render() {
        return "◌";
    }
}

class FilledCircle extends Circle {
    @Override
    public String render() {
        return "●";
    }
}

//  ○   ●   ◌
