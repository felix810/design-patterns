package org.fy.strategy.enums;

/**
 * created by fy on 2018/3/9 11:09.
 * version:1.0
 * describe:
 */
public class Clinet {
    public static void main(String args[]){
        int a= 10;
        int b=6;
        System.out.println("运行结果："+Calculator.ADD.exec(a,b));
        System.out.println("运行结果："+Calculator.SUB.exec(a,b));
    }
}
