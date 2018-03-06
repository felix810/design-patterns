package org.fy.proxy.subject;

/**
 * created by fy on 2018/3/6 11:21.
 * version:1.0
 * describe:
 */
public class BeforeAdvice implements IAdvice{
    public void doSomething() {
        System.out.println("我是前置，我先干活");
    }
}
