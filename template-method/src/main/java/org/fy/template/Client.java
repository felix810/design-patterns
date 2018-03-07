package org.fy.template;

/**
 * created by fy on 2018/2/8 16:37.
 * version:1.0
 * describe:
 */
public class Client {
    public static void main(String args[]){
        ConcreteClass1 concreteClass1=new ConcreteClass1();
        ConcreteClass2 concreteClass2=new ConcreteClass2();
        concreteClass1.run();
        concreteClass2.run();
    }
}
