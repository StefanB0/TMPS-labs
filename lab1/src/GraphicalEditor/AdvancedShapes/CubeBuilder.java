package GraphicalEditor.AdvancedShapes;

public class CubeBuilder implements Shape3DBuilder{
    Cube cube;

    public CubeBuilder() {
        cube = new Cube();
    }

    @Override
    public void reset() {
        this.cube = new Cube();
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.cube.x = x;
        this.cube.y = y;
    }

    @Override
    public void setSize(int size) {
        this.cube.size = size;
    }

    @Override
    public void setTexture(String texture) {
        this.cube.texture = texture;
    }

    @Override
    public Shape3D getResult() {
        return this.cube;
    }
}
