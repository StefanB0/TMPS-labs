package GraphicalEditor.AdvancedShapes;

import GraphicalEditor.Shape;

public class Sphere implements Shape3D{

    int x, y;
    int size;
    String texture;

    public Sphere() {
        this.x = 0;
        this.y = 0;
        this.size = 0;
        this.texture = "none";
    }

    @Override
    public Shape clone() {
        Sphere newS = new Sphere();
        newS.x = this.x;
        newS.y = this.y;
        newS.size = this.size;
        newS.texture = this.texture;

        return newS;
    }

    @Override
    public String render() {
        String s = "[sphere :{" + String.valueOf(this.x) + ", " + String.valueOf(this.y);
        if (this.size != 0)
            s += ", " + String.valueOf(this.size);

        if (this.texture != "none")
            s += ", " + this.texture;

        s += "}]";
        return s;
    }
}
