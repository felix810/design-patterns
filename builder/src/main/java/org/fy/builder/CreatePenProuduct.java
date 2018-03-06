package org.fy.builder;

/**
 * created by fy on 2018/3/5 15:28.
 * version:1.0
 * describe:
 */
public class CreatePenProuduct extends Builder{

    public void doStart() {
        System.out.println("开始造笔了");
    }

    public Product buildProduct() {
        System.out.println("笔生产出来了");
        return new Pen();
    }
}
