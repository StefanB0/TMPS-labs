package GraphicalEditor.EmojiFaces;

import GraphicalEditor.Shape;

public class HappyFace implements EmojiFace {
    private String happy;
    public HappyFace() {
        this.happy = ":)";
    }

    @Override
    public Shape clone() {
        HappyFace hp = new HappyFace();
        hp.happy = this.happy;
        return hp;
    }

    @Override
    public String render() {
        return this.happy;
    }
}
