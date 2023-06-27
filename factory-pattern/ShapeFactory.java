public class ShapeFactory {
    public Shape createShape(String shape){
        if(shape.equalsIgnoreCase("Circle")){
            return  new Circle();
        }
        else if(shape.equalsIgnoreCase("Square")){
            return  new Square();
        }
        return null;
    }
}
