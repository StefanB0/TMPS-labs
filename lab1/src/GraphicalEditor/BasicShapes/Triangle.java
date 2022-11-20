package GraphicalEditor.BasicShapes;

import GraphicalEditor.Shape;

public class Triangle implements Shape {
    @Override
    public Shape clone() {
        return this;
    }

    @Override
    public String render() {
        return "△";
    }
}

class SmallTriangle extends Triangle {
    @Override
    public String render() {
        return "▵";
    }
}

class FilledTriangle extends Triangle {
    @Override
    public String render() {
        return "▲";
    }
}

//  ▲   △   ▵