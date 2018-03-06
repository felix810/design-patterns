package org.fy.mediator;

import java.util.Random;

/**
 * created by fy on 2018/3/6 16:04.
 * version:1.0
 * describe:
 */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void sellComputer(int number){
        super.obj.exextue("sale.sell",number);
        System.out.println("销售电脑"+number+"台");
    }

    public int getSellStatus(){
        Random random=new Random(System.currentTimeMillis());
        int status=random.nextInt(100);
        System.out.println("查看销售情况"+status+"台");
        return status;
    }

    public void offsale(){
        super.obj.exextue("sale.offsale");
    }
}
