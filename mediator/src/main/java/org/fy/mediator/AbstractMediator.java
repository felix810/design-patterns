package org.fy.mediator;

/**
 * created by fy on 2018/3/6 15:52.
 * version:1.0
 * describe:
 */
public abstract class AbstractMediator {

     Purchase purchase;

     Sale sale;

     Stock stock;

    public AbstractMediator(){
        purchase=new Purchase(this);
        sale=new Sale(this);
        stock=new Stock(this);
    }

    public abstract void exextue(String str,Object... objects);
}
