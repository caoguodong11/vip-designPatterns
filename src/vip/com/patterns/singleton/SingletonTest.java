package vip.com.patterns.singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {
    public static void main(String[] args) throws Exception {
        beanFactoryTest();
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

    public static void beanFactoryTest(){
        for ( int i = 0; i< 100; i++) {
            Object bean = BeanFactory.getBean("vip.com.patterns.singleton.Pojo");
            System.out.println((i+1)+":"+bean);
        }
    }
}
