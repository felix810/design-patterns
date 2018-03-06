package org.fy.proxy.subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * created by fy on 2018/3/6 11:17.
 * version:1.0
 * describe:
 */
public class DyanmicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader classLoader,Class<?>[] interfaces,InvocationHandler invocationHandler ){

        if(true){
            ( new BeforeAdvice()).doSomething();
        }

        return (T) Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }

 }
