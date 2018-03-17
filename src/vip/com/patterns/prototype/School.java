package vip.com.patterns.prototype;

import java.io.Serializable;

/**
 * 原型模式：浅拷贝
 */
public class School implements Serializable{
    private String name;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
