package org.fy.builder;

/**
 * created by fy on 2018/2/8 18:24.
 * version:1.0
 * describe:建造者模式
 */
public abstract class Builder {
    public abstract void doStart();
    public abstract Product buildProduct();
}
