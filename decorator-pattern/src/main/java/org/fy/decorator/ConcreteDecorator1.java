package org.fy.decorator;

/**
 * created by fy on 2018/3/8 15:58.
 * version:1.0
 * describe:具体的装饰角色
 */
public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public void method1(){
        System.out.println("我要先做一件事情");
    }

    @Override
    public void operate(){
        this.method1();
        super.operate();
    }
}
