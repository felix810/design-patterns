package org.fy.adapter;

/**
 * created by fy on 2018/3/12 14:34.
 * version:1.0
 * describe: 把一个类的接口变成客户端所期待的另一种接口。从而使因为接口不同而不能同时工作的两个接口在一起工作
 *
 * 适配器的核心角色。把原有的角色包装成所需要的角色，通过继承或者封装的方式。
 */
public class Adapter extends Adaptee implements Target{
    public void request() {
       super.dosomething();
    }
}
