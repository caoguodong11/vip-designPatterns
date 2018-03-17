package vip.com.patterns.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Tom tom = new Tom();
        JdkProxy p = new JdkProxy();
        Person proxy = (Person)p.getTarget(tom);
        proxy.findJob();
        proxy.findLove();
        System.out.println(proxy.getClass());
    }
}
