package org.fy.mediator;

/**
 * created by fy on 2018/3/6 15:54.
 * version:1.0
 * describe:
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void buyComputer(int number){
        super.obj.exextue("purchase.buy",number);
    }

    public void refuseComputer(){
        System.out.println("不在采购电脑");
    }
}
