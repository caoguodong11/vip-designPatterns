package vip.com.patterns.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * 代理模式
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception {
        System.out.println(ProxyTest.class.getResource(".").getPath());
       // jdkTest();
    }

    public static void jdkTest() throws Exception {
        Tom tom = new Tom();
        JdkProxy p = new JdkProxy();
        Person proxy = (Person) p.getTarget(tom);
        proxy.findJob();
        proxy.findLove();
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    public static void cglibTest() {
        CglibProxy cglibProxy = new CglibProxy();
        Tom tom = new Tom();
        Tom instance = (Tom) cglibProxy.getInstance(tom.getClass());
        instance.findJob();
    }
}
