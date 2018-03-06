package org.fy.builder;

/**
 * created by fy on 2018/2/8 18:57.
 * version:1.0
 * describe:
 */
public class Director {

    //构建不同的产品
    public Product getBookProduct(){
        Builder book = new CreateBookProduct();
        book.doStart();
        return book.buildProduct();
    }


    //构建不同的产品
    public Product getPenProduct(){
        Builder pen=new CreatePenProuduct();
        pen.doStart();
        return pen.buildProduct();
    }
}
