package org.fy.template;

/**
 * created by fy on 2018/2/8 16:35.
 * version:1.0
 * describe:模板方法模式。父类定义几个抽象的方法，由子类去扩展执行， 在封装一个不可变的部分
 * 行为由父类控制，实现由子类
 */
public abstract class AbstractClass {
    protected void doSomething1(){};
    protected void doSomething2(){};

    /**
     * 判断是否需要做第二件事
     * @return
     */
    protected boolean isDoSomething2(){
        return true;
    };

    /**
     * 增加final，不允许被继承
     */
    public final void run (){
        doSomething1();
        if(isDoSomething2()){
            doSomething2();
        }
    }
}
