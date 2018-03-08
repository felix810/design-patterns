package org.fy.decorator;

/**
 * created by fy on 2018/3/8 16:00.
 * version:1.0
 * describe:
 */
public class Client {

    public static void main(String args[]){
        Component component=new ConcreteComponent();

        component=new ConcreteDecorator1(component);

        component=new ConcreteDecorator2(component);

        component.operate();
    }
}
