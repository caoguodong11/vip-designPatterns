package vip.com.patterns.factory.abstr;

import vip.com.patterns.factory.Milk;

public abstract class AbstractFactory {
    protected abstract Milk getTelusuMilk();
    protected abstract Milk getYiliMilk();
}
