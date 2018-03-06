package org.fy.proxy.subject;

/**
 * created by fy on 2018/3/6 11:13.
 * version:1.0
 * describe:
 */
public class RealSubject implements Subject{
    public void doSomething(String str) {
        System.out.println("我开始做一些事情了"+str);
    }
}
