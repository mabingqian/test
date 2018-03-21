package DesignPattern.AbstractFactoryPattern.Factorys;

import DesignPattern.AbstractFactoryPattern.colors.Color;
import DesignPattern.AbstractFactoryPattern.colors.Green;
import DesignPattern.AbstractFactoryPattern.colors.Red;
import DesignPattern.AbstractFactoryPattern.shapes.Shape;

public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        }
        return null;
    }

    public Object getShape(Class<? extends Shape> clazz) {
        return null;
    }

    public <T> T getShape2(Class<? extends T> clazz) {
        return null;
    }
}
