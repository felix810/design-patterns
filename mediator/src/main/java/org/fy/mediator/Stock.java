package org.fy.mediator;

/**
 * created by fy on 2018/3/6 15:57.
 * version:1.0
 * describe:
 */
public class Stock extends AbstractColleague{
    public Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    private static int STOCK=100;

    public void increase(int number){
        STOCK=STOCK+number;
        System.out.println("更新后的库存是"+STOCK+"台");
    }

    public void decrease(int number){
        STOCK=STOCK-number;
        System.out.println("销售后的库存是"+STOCK+"台");
    }

    public int getSTOCK(){
        System.out.println("当前库存是"+STOCK+"台");
        return STOCK;
    }

    public void clearStock(){
        System.out.println("清理前的库存是"+STOCK+"台");
        STOCK=0;
    }
}
