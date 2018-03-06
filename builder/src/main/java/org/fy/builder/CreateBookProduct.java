package org.fy.builder;

/**
 * created by fy on 2018/2/8 18:25.
 * version:1.0
 * describe:
 */
public class CreateBookProduct extends Builder{


    public void doStart() {
        System.out.println("开始印书了");
    }

    public Product buildProduct() {
        System.out.println("书本印刷好了");
        return new Books();
    }
}
