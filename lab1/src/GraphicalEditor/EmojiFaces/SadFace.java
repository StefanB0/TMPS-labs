package GraphicalEditor.EmojiFaces;

import GraphicalEditor.Shape;

public class SadFace implements Shape {
    private String sad;
    SadFace(){
        this.sad = ";(";
    }

    @Override
    public Shape clone() {
        SadFace sd = new SadFace();
        sd.sad = this.sad;
        return sd;
    }

    @Override
    public String render() {
        return this.sad;
    }
}
