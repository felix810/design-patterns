package org.fy.command.group;

/**
 * created by fy on 2018/3/7 10:37.
 * version:1.0
 * describe:
 */
public class Client {

    public static void main(String args[]){
        Command add=new AddRequirementCommand();
        Invoker invoker=new Invoker();
        invoker.setCommand(add);
        invoker.action();


        Command delete=new DeleteRequirementCommand();
        Invoker deleInvoker=new Invoker();
        deleInvoker.setCommand(delete);
        deleInvoker.action();
    }
}
