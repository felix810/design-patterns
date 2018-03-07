package org.fy.command.group;

/**
 * created by fy on 2018/3/7 10:30.
 * version:1.0
 * describe: 命令模式
 * 调用者和接收者之间没有依赖关系，通过command来处理，且command的子类非常容易扩展，对于其他模块不产生严重的代码耦合。
 * 缺点:如果有多个命令，就需要扩充多个子类
 */
public abstract class Command {

    public CodeGroup codeGroup=new CodeGroup();
    public PageGroup pageGroup=new PageGroup();
    public RequirementGroup requirementGroup=new RequirementGroup();
    public abstract void execute();

}
