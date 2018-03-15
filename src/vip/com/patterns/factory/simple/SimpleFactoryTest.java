package vip.com.patterns.factory.simple;

import vip.com.patterns.factory.Milk;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Milk milk = simpleFactory.getMilk("伊利");
        System.out.println(milk.getName());
    }
}
