package vip.com.patterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) throws Exception {
        LazyTest();
    }

    public static void hungryTest(){
        for ( int i = 0; i< 100; i++) {
            Hungry instance = Hungry.getInstance();
            System.out.println(instance);
        }
    }

    public static void LazyTest() throws Exception {
        /*for ( int i = 0; i< 100; i++) {
            Lazy instance = Lazy.getInstance();
            System.out.println(instance);
        }*/

        Class<Lazy> lazyClass = Lazy.class;
        Constructor<Lazy> declaredConstructor = lazyClass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Lazy lazy = declaredConstructor.newInstance();
        System.out.println(lazy);
        declaredConstructor.newInstance();

    }
}
