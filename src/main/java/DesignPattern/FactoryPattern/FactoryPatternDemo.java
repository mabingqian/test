package DesignPattern.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //get Circle Object
        Shape shape = shapeFactory.getShape("CIRCLE");
        if (shape != null) {
            shape.draw();
        }


        //类型强制转换
        System.out.println("=================1");
        Square square = (Square) ShapeFactory.getClass(Square.class);
        square.draw();

        Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
        circle.draw();


        System.out.println("=================2");
        //省略类型强制转换，支持多态
        Shape shape1 = ShapeFactory.getClass2(Circle.class);
        shape1.draw();
    }

}
