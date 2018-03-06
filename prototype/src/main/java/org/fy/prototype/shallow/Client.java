package org.fy.prototype.shallow;

/**
 * created by fy on 2018/3/6 14:54.
 * version:1.0
 * describe:
 */
public class Client {
    public static void main(String args[]){
        Thing thing=new Thing();
        thing.setArrayList("张三");
        Thing clonething=thing.clone();
        clonething.setArrayList("李四");
        System.out.println(thing.getArrayList());
        System.out.println(clonething.getArrayList());
    }
}
