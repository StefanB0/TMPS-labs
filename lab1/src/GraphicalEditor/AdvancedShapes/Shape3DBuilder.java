package GraphicalEditor.AdvancedShapes;

public interface Shape3DBuilder {
    public void reset();

    public void setCoordinates(int x, int y);
    public void setSize(int size);

    public void setTexture(String texture);

    public Shape3D getResult();
}
