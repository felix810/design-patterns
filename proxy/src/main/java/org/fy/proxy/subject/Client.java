package org.fy.proxy.subject;

import java.lang.reflect.InvocationHandler;

/**
 * created by fy on 2018/3/6 11:22.
 * version:1.0
 * describe:
 */
public class Client {
    public static void main(String args[]){
       Subject subject=new RealSubject();
        InvocationHandler invocationHandler=new MyInvokeHandler(subject);
        Subject proxy=DyanmicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),invocationHandler);
        proxy.doSomething("哈哈哈");



        Subject subject2=new RealSubject();
        Subject proxy2=SubjectDyanmicProxy.newProxyInstance(subject2);
        proxy2.doSomething("哈哈哈2");
    }
}
