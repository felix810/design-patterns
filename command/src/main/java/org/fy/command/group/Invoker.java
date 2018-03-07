package org.fy.command.group;

/**
 * created by fy on 2018/3/7 10:35.
 * version:1.0
 * describe:
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void action(){
        this.command.execute();
    }
}
