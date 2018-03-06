package org.fy.singleton.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * created by fy on 2018/2/8 10:51.
 * version:1.0
 * describe: 单例工厂模式，由工厂去创建单例
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class cl=Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor=cl.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
