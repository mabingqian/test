package DesignPattern.AbstractFactoryPattern.Factorys;

import DesignPattern.AbstractFactoryPattern.colors.Color;
import DesignPattern.AbstractFactoryPattern.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Object getShape(Class<? extends Shape> clazz);
    public abstract <T> T getShape2(Class<? extends T> clazz);
}
