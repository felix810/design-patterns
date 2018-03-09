package org.fy.strategy.template;

/**
 * created by fy on 2018/3/9 10:33.
 * version:1.0
 * describe:
 */
public class Client {

    public static void main(String args[]){
        Strategy strategy1=new ConcreteStrategy1();
        Context context=new Context(strategy1);
        context.doSomething();


        Strategy strategy2=new ConcreteStrategy2();
        context=new Context(strategy2);
        context.doSomething();
    }

}
