package vip.com.patterns.factory.func;

import vip.com.patterns.factory.Milk;
import vip.com.patterns.factory.Telunsu;
import vip.com.patterns.factory.Yili;

public class TelunsuFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
