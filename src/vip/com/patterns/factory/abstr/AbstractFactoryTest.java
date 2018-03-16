package vip.com.patterns.factory.abstr;

import vip.com.patterns.factory.Milk;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MilkFactory();
        Milk telusuMilk = abstractFactory.getTelusuMilk();
        System.out.println(telusuMilk.getName());
    }
}
