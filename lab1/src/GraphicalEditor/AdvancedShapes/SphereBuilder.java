package GraphicalEditor.AdvancedShapes;

public class SphereBuilder implements Shape3DBuilder{

    Sphere sphere;

    public SphereBuilder() {
        sphere = new Sphere();
    }

    @Override
    public void reset() {
        this.sphere = new Sphere();
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.sphere.x = x;
        this.sphere.y = y;
    }

    @Override
    public void setSize(int size) {
        this.sphere.size = size;
    }

    @Override
    public void setTexture(String texture) {
        this.sphere.texture = texture;
    }

    @Override
    public Shape3D getResult() {
        return this.sphere;
    }
}
