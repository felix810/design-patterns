package org.fy.mediator;

/**
 * created by fy on 2018/3/6 16:08.
 * version:1.0
 * describe:中介者定义了多个private，目的是为了处理各个对象之间的依赖关系。把原有一个对象有多个依赖关系转移到中介者身上。
 * 对象只与中介者相互依赖，减少依赖关系
 */
public class Mediator extends AbstractMediator{
    public void exextue(String str, Object... objects) {
        if(str.equals("purchase.buy")){
            buyComptuer((Integer) objects[0]);
        }else if(str.equals("sale.offsale")){
            clearStock();
        }else if(str.equals("sale.sell")){
            sellComputer((Integer) objects[0]);
        }
    }

    private void buyComptuer(int number){

        int saleStatus=super.sale.getSellStatus();
        if(saleStatus>50){
            System.out.println("销售情况良好。采购电脑"+number);
            super.stock.increase(number);
        }else{
            int buyNumber=number/2;
            System.out.println("销售情况不好，折半采购电脑"+buyNumber);
            super.stock.increase(buyNumber);
        }
    }

    private void buyComptuerAll(int number){
        System.out.println("采购电脑"+number+"台");
        super.stock.increase(number);
    }

    private void sellComputer(int number){
        int stock=super.stock.getSTOCK();
        if(stock<number){
            System.out.println("数量不够，先采购");
            buyComptuerAll(number);
        }
        super.stock.decrease(number);
    }

    private void clearStock(){
        super.purchase.refuseComputer();
        int stock=super.stock.getSTOCK();
        super.sale.sellComputer(stock);
    }
}
