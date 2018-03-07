package org.fy.handler;

/**
 * created by fy on 2018/3/7 16:27.
 * version:1.0
 * describe:
 */
public class Client {

    public static void main(String args[]){
        Handler handler1=new TestHandler1();
        Handler handler2=new TestHandler2();
        Handler handler3=new TestHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Request request=new Request();
        request.setRequestLevel(Level.ONE);

        Response response=handler1.handlerMessage(request);
        response.doSomething();
        System.out.println("-----------------------------");

        request.setRequestLevel(Level.TWO);
        response=handler1.handlerMessage(request);
        response.doSomething();
        System.out.println("-----------------------------");

        request.setRequestLevel(Level.THREE);
        response=handler1.handlerMessage(request);
        response.doSomething();
    }
}
