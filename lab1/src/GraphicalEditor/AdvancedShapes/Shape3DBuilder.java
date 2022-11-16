package GraphicalEditor.AdvancedShapes;

public interface Shape3DBuilder {
    public void reset();

    public void setCoordinates();
    public void setVolume();
    public void setMesh();
    public void setTexture();

    public Shape3D getResult();
}
