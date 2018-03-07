package org.fy.handler;

/**
 * created by fy on 2018/3/7 16:22.
 * version:1.0
 * describe:
 */
public class TestHandler1 extends Handler{

    public int getHanderLevel() {
        return Level.ONE;
    }

    public Response execute(Request request) {
        System.out.println("第一个测试用例执行");
        return new Response(request);
    }
}
