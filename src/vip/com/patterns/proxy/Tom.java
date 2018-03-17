package vip.com.patterns.proxy;

public class Tom implements Person{
    @Override
    public void findLove() {
        System.out.println("我要找对象");
    }

    @Override
    public void findJob() {
        System.out.println("我要找工作");
    }
}
