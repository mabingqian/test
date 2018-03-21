package DesignPattern.AbstractFactoryPattern.Factorys;

public class FactoryProducer {
    public static AbstractFactory getFactory(String object) {
        if ("SHAPE".equalsIgnoreCase(object)) {
            return new ShapeFactory();
        } else if ("COLOR".equalsIgnoreCase(object)) {
            return new ColorFactory();
        }
        return null;
    }

}
