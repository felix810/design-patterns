package org.fy.proxy.game;

/**
 * created by fy on 2018/3/5 16:17.
 * version:1.0
 * describe:
 */
public class GamePlayer implements IGamePlayer{

    private String name;
    public GamePlayer(String name){
        this.name=name;
    }

    public void login() {
        System.out.println(name+"登录成功");
    }

    public void killBoss() {
        System.out.println(name+"击杀boos");
    }

    public void upGrade() {
        System.out.println(name+"升级");
    }
}
