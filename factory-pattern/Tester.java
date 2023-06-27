public class Tester {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle=shapeFactory.createShape("circle");
        Shape square=shapeFactory.createShape("square");
        circle.draw();
        square.draw();
    }
}
