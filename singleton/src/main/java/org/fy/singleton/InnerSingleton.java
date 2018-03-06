package org.fy.singleton;

/**
 * created by fy on 2018/2/7 15:19.
 * version:1.0
 * describe:内部类的单例模式
 * 内部类在编译完成后也是一个单独的class文件，因此在不使用的情况下Inner类是不会被加载的。同时，JVM保证在类加载的过程中static代码块在多线程或者单线程下都正确执行，且仅执行一次。
 * 解决了延迟加载以及线程安全的问题
 */
public class InnerSingleton {

    private InnerSingleton(){};
    private static class Inner{
        private static  InnerSingleton innerSingleton=new InnerSingleton();
    }
    public static InnerSingleton getInstance(){
        return Inner.innerSingleton;
    }
}
