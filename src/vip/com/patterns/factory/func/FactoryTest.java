package vip.com.patterns.factory.func;

import vip.com.patterns.factory.Milk;

import javax.sound.midi.Soundbank;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new TelunsuFactory();
        Milk milk = factory.getMilk();
        System.out.println(milk);
    }
}
