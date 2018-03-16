package vip.com.patterns.Singleton;

/**
 * 单例模式：懒汉式
 */
public class Lazy {

    public static boolean isInstance = false;

    private Lazy(){
       synchronized (Lazy.class){
           if(isInstance == false){
               isInstance = true;
           }else{
               throw new RuntimeException("单例模式被入侵！");
           }
       }
    }

    public static final Lazy getInstance(){
        return LazyHolder.lazy;
    }


    //默认不加载内部类，在使用Lazy时会优先调用内部类
    public static class LazyHolder {
         public final static Lazy lazy = new Lazy();
    }
}
