package org.fy.handler;

/**
 * created by fy on 2018/3/7 16:24.
 * version:1.0
 * describe:
 */
public class TestHandler3 extends Handler{

    public int getHanderLevel() {
        return Level.THREE;
    }

    public Response execute(Request request) {
        System.out.println("第三个测试用例执行");
        return new Response(request);
    }
}
