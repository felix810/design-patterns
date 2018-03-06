package org.fy.proxy.subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * created by fy on 2018/3/6 11:14.
 * version:1.0
 * describe:
 */
public class MyInvokeHandler implements InvocationHandler{

    private Object target=null;

    public MyInvokeHandler(Object obj){
        this.target=obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        return method.invoke(this.target,args);
    }
}
