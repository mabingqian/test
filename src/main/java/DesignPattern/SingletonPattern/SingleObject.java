package DesignPattern.SingletonPattern;

public class SingleObject {

    //双检锁
    private volatile static SingleObject singleObject;

    private SingleObject() {}

    public static SingleObject getSingleObject() {
        if (singleObject == null) {
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    singleObject =  new SingleObject();
                }
            }
        }
        return singleObject;
    }


    //登记式/静态内部类
/*    private static class SingletonHolder {
        private static final SingleObject instance = new SingleObject();
    }
    private SingleObject() {}

    public static final SingleObject getInstance() {
        return SingletonHolder.instance;
    }
*/

}
