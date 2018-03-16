package vip.com.patterns.singleton;

/**
 * 单例模式:饿汉式
 */
public class Hungry {
    public final static Hungry hungry = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance(){
        return hungry;
    }

}
