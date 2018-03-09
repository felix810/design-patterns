package org.fy.strategy.template;

/**
 * created by fy on 2018/3/9 10:26.
 * version:1.0
 * describe: 策略模式，把每个算法都封装起来，并使他们可以互相转让
 *
 * 抽象的策略角色，定义每个策略必须实现的方法和属性
 */
public interface Strategy {

    void doSomething();
}
