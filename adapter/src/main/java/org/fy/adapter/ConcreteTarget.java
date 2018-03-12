package org.fy.adapter;

/**
 * created by fy on 2018/3/12 14:33.
 * version:1.0
 * describe:
 */
public class ConcreteTarget implements Target{
    public void request() {
        System.out.println("最开始执行的核心方法");
    }
}
