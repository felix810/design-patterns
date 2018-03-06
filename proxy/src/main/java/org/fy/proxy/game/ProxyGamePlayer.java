package org.fy.proxy.game;

/**
 * created by fy on 2018/3/5 16:19.
 * version:1.0
 * describe:
 */
public class ProxyGamePlayer implements IGamePlayer{

    private GamePlayer gamePlayer;

    public ProxyGamePlayer(GamePlayer gamePlayer){
        this.gamePlayer=gamePlayer;
    }

    public void proxy(){
        login();
        killBoss();
        upGrade();
    }

    public void login() {
        gamePlayer.login();
    }

    public void killBoss() {
        gamePlayer.killBoss();
    }

    public void upGrade() {
        gamePlayer.upGrade();
    }
}
