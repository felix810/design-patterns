package org.fy.builder;

/**
 * created by fy on 2018/3/5 13:52.
 * version:1.0
 * describe:
 */
public class Test {
    public static void main(String args[]){

        Director director=new Director();

        Product book=director.getBookProduct();
        book.doSomething();

        Product pen=director.getPenProduct();
        pen.doSomething();
    }
}
