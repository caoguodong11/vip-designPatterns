package vip.com.patterns.factory.simple;

import vip.com.patterns.factory.Milk;
import vip.com.patterns.factory.Telunsu;
import vip.com.patterns.factory.Yili;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public Milk getMilk(String milkName){
        if("特仑苏".equals(milkName)){
            return new Telunsu();
        }else if("伊利".equals(milkName)){
            return new Yili();
        }
        return null;
    }
}
