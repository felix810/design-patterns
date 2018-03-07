package org.fy.handler;

/**
 * created by fy on 2018/3/7 16:23.
 * version:1.0
 * describe:
 */
public class TestHandler2 extends Handler{

    public int getHanderLevel() {
        return Level.TWO;
    }

    public Response execute(Request request) {
        System.out.println("第二个测试用例执行");
        return new Response(request);
    }
}
