package org.fy.proxy.game;

/**
 * created by fy on 2018/3/5 16:20.
 * version:1.0
 * describe: 代理模式
 */
public class Client {

    public static void main(String args[]){
        GamePlayer gamePlayer=new GamePlayer("张三");
        ProxyGamePlayer proxyGamePlayer=new ProxyGamePlayer(gamePlayer);
        proxyGamePlayer.proxy();

        GamePlayer gamePlayer2=new GamePlayer("李四");
        ProxyGamePlayer proxyGamePlayer2=new ProxyGamePlayer(gamePlayer2);
        proxyGamePlayer2.proxy();
    }
}
