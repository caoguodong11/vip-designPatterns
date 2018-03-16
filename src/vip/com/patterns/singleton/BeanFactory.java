package vip.com.patterns.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private static Map<String, Object> map = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        if(map.containsKey(className)){
            return map.get(className);
        }else{
            Object o = null;
            try {
                Thread.currentThread().sleep(1000);
                Class<?> clazz = Class.forName(className);
                o = clazz.newInstance();
                map.put(className, o);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return o;
        }
    }
}
