package org.fy.singleton;

/**
 * created by fy on 2018/2/7 15:14.
 * version:1.0
 * describe: 双检锁机制
 */
public class SynchronizedMethodSingleton {
    private static SynchronizedMethodSingleton synchronizedMethodSingleton;
    private SynchronizedMethodSingleton(){};
    public static synchronized SynchronizedMethodSingleton getInstance(){
        if(synchronizedMethodSingleton==null){
            synchronized (SynchronizedMethodSingleton.class){
                if(synchronizedMethodSingleton==null){
                    synchronizedMethodSingleton=new SynchronizedMethodSingleton();
                }
            }
        }
        return synchronizedMethodSingleton;
    }
}
