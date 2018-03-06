package org.fy.mediator;

/**
 * created by fy on 2018/3/6 16:27.
 * version:1.0
 * describe:
 */
public class Client {

    public static void main(String args[]){
        AbstractMediator abstractMediator=new Mediator();

        Purchase purchase=new Purchase(abstractMediator);
        purchase.buyComputer(100);


        Sale sale=new Sale(abstractMediator);
        sale.sellComputer(20);

        sale.offsale();
    }
}
