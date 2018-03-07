package org.fy.template;

/**
 * created by fy on 2018/2/8 16:36.
 * version:1.0
 * describe:
 */
public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomething1(){
        System.out.println("子类1执行一些事情");
    }
    @Override
    protected void doSomething2(){
        System.out.println("子类1执行剩下的一些事情");
    }
    @Override
    protected boolean isDoSomething2(){
        return false;
    }
}
