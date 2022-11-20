package GraphicalEditor.AdvancedShapes;

import GraphicalEditor.Shape;

public class Cube implements Shape3D{
    int x, y;
    int size;
    String texture;

    public Cube() {
        this.x = 0;
        this.y = 0;
        this.size = 0;
        this.texture = "none";
    }

    @Override
    public Shape clone() {
        Cube newC = new Cube();
        newC.x = this.x;
        newC.y = this.y;
        newC.size = this.size;
        newC.texture = this.texture;

        return newC;
    }

    @Override
    public String render() {
        String s = "[Cube:{" + String.valueOf(this.x) + ", " + String.valueOf(this.y);
        if (this.size != 0)
            s += ", " + String.valueOf(this.size);

        if (this.texture != "none")
            s += ", " + this.texture;

        s += "}]";
        return s;
    }
}
