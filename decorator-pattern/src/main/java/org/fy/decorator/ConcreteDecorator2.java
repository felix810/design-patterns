package org.fy.decorator;

/**
 * created by fy on 2018/3/8 15:59.
 * version:1.0
 * describe:具体的装饰角色
 */
public class ConcreteDecorator2 extends Decorator{

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void method2(){
        System.out.println("我要收尾");
    }

    @Override
    public void operate(){
        super.operate();
        this.method2();
    }
}
