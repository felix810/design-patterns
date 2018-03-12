package org.fy.adapter;

/**
 * created by fy on 2018/3/12 14:36.
 * version:1.0
 * describe: 原来的角色，经过被适配器包装成另外一个角色
 */
public class Adaptee {

    public void dosomething(){
        System.out.println("最新增加的核心方法");
    }
}
