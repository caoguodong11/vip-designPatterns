package vip.com.patterns.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        cglibTest();
    }

    public static void jdkTest(){
        Tom tom = new Tom();
        JdkProxy p = new JdkProxy();
        Person proxy = (Person)p.getTarget(tom);
        proxy.findJob();
        proxy.findLove();
        System.out.println(proxy.getClass());
    }

    public static void cglibTest(){
        CglibProxy cglibProxy = new CglibProxy();
        Tom tom = new Tom();
        Tom instance = (Tom)cglibProxy.getInstance(tom.getClass());
        instance.findJob();
    }
}
