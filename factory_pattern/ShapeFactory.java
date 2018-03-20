package designPattern;

public class ShapeFactory {

    // 使用实例方法getShape来获取Shape的对象
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SquAre")) {
            return new Square();
        }
        return null;
    }
}
