package DesignPattern.FactoryPattern;

public class ShapeFactory {

    /**
     * first one
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }


    /**secondly
     * 反射机制
     * @param clazz
     * @return
     */
    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException cfe) {
            System.out.println("class not fund");
        } catch (InstantiationException ie) {
            System.out.println("instant exception");
        } catch (IllegalAccessException iae) {
            System.out.println("illegal access exception");
        }
        return obj;
    }


    //省略类型强制转换，支持多态
    public static <T> T getClass2(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T)Class.forName(clazz.getName()).newInstance();
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
