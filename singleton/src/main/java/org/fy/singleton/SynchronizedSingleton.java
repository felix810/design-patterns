package org.fy.singleton;

/**
 * created by fy on 2018/2/7 15:06.
 * version:1.0
 * describe:方法上增加synchronized锁
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton sychronizedSingleton;

    private SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getIntance(){
            if(sychronizedSingleton==null){
                sychronizedSingleton=new SynchronizedSingleton();
                return sychronizedSingleton;
            }else{
                return sychronizedSingleton;
            }
    }

}
