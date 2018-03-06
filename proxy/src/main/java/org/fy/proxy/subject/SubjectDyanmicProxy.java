package org.fy.proxy.subject;

import java.lang.reflect.InvocationHandler;

/**
 * created by fy on 2018/3/6 13:44.
 * version:1.0
 * describe:
 */
public class SubjectDyanmicProxy extends DyanmicProxy{

    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader=subject.getClass().getClassLoader();
        Class<?>[] classes=subject.getClass().getInterfaces();
        InvocationHandler invocationHandler=new MyInvokeHandler(subject);
        return newProxyInstance(classLoader,classes,invocationHandler);
    }
}
