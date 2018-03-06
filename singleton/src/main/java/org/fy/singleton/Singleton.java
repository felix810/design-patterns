package org.fy.singleton;

/**
 * created by fy on 2018/2/7 14:49.
 * version:1.0
 * describe:普通的单例模式
 */
public class Singleton {

    private Singleton(){

    }

    private Singleton singleton=null;

    public Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
