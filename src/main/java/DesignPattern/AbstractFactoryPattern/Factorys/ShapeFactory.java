package DesignPattern.AbstractFactoryPattern.Factorys;

import DesignPattern.AbstractFactoryPattern.colors.Color;
import DesignPattern.AbstractFactoryPattern.shapes.Circle;
import DesignPattern.AbstractFactoryPattern.shapes.Rectangle;
import DesignPattern.AbstractFactoryPattern.shapes.Shape;
import DesignPattern.AbstractFactoryPattern.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {
        return null;
    }

    //fanshe
    public Object getShape(Class<? extends Shape> clazz) {
        Object object = null;
        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException ex1) {
            System.out.println("class not fund");
        } catch (InstantiationException ex2) {
            System.out.println("instant exception");
        } catch (IllegalAccessException ex3) {
            System.out.println("illegal exception");
        }
        return object;
    }

    //省略类型强制转换，支持多态
    public <T> T getShape2(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException cfe) {
            System.out.println("this is not fund");
        } catch (InstantiationException ie) {
            System.out.println("instant exception");
        } catch (IllegalAccessException lae) {
            System.out.println("illegal access exception");
        }
        return obj;
    }
}
