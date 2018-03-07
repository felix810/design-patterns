package org.fy.handler;

/**
 * created by fy on 2018/3/7 11:19.
 * version:1.0
 * describe:
 */
public class Response {
    private Request request;

    public Response(Request request){
        this.request=request;
    }

    public void doSomething(){
        System.out.println(this.request.getRequestLevel()+"已经执行完成了");
    }
}
