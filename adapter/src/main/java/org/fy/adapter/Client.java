package org.fy.adapter;

/**
 * created by fy on 2018/3/12 14:37.
 * version:1.0
 * describe:
 */
public class Client {

    public static void main(String args[]){
        Target target=new ConcreteTarget();
        target.request();

        Target target1=new Adapter();
        target1.request();
    }
}
