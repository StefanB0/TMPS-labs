package GraphicalEditor.BasicShapes;

public interface AbstractShapeFactory {

}
class DefaultShapeFactory implements AbstractShapeFactory{

}

class DottedShapeFactory implements AbstractShapeFactory {

}

class FilledShapeFactory implements AbstractShapeFactory{
    DottedCircle dc;
}