package org.fy.handler;


/**
 * created by fy on 2018/3/7 11:16.
 * version:1.0
 * describe:责任链模式：多个对象都有机会去处理请求，避免了请求者与接收者之间的耦合关系。将这些对象放在一个链上面，并沿着这条链去处理请求，直到处理完成。
 * 抽象处理有三个职责：第一、定义一个请求的处理方法handlerMessage 第二个是定义一个链的编排方法setNextHandler 。第三个是定义处理者必须实现的两个方法
 * getHanderLevel当前的级别和execute 实际处理的方法
 * 优点：解耦合 缺点：链条太长，影响性能
 */
public abstract class Handler {

    private Handler nextHandler;

    public abstract int getHanderLevel();

    public abstract Response execute(Request request);

    public void setNextHandler(Handler handler){
        this.nextHandler=handler;
    }

    public final Response handlerMessage(Request request){
        Response response=null;
        if(this.getHanderLevel()==request.getRequestLevel()){
            response=this.execute(request);
        }else{
            System.out.println("第"+request.getRequestLevel()+"级别在第"+this.getHanderLevel()+"节点中找不到级别，寻找下一个");
            if(this.nextHandler!=null){
                response=this.nextHandler.handlerMessage(request);
            }else{
                System.out.println("没有任何节点可以执行");
            }
        }
        return response;
    }
}
