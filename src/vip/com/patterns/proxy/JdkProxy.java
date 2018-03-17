package vip.com.patterns.proxy;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler{
    private Person target;

    public Object getTarget(Person target) {
        this.target = target;
        Class<? extends Person> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("findLove".equals(method.getName())){
            System.out.println("媒婆开始帮你找对象");
            Object o = method.invoke(target,args);
            System.out.println("媒婆帮你找到对象啦");
        }else if("findJob".equals(method.getName())){
            System.out.println("媒婆开始帮你找工作");
            Object o = method.invoke(target,args);
            System.out.println("媒婆帮你找到工作啦");
        }
        return null;
    }
}
