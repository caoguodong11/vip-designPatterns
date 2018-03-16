package vip.com.patterns.factory.abstr;

import vip.com.patterns.factory.Milk;
import vip.com.patterns.factory.Telunsu;
import vip.com.patterns.factory.Yili;

public class MilkFactory extends AbstractFactory{

    @Override
    protected Milk getTelusuMilk() {
        return new Telunsu();
    }

    @Override
    protected Milk getYiliMilk() {
        return new Yili();
    }
}
