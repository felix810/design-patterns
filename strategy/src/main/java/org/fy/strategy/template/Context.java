package org.fy.strategy.template;

/**
 * created by fy on 2018/3/9 10:31.
 * version:1.0
 * describe:
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void doSomething(){
        this.strategy.doSomething();
    }

}
