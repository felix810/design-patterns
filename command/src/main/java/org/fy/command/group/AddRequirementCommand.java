package org.fy.command.group;

/**
 * created by fy on 2018/3/7 10:33.
 * version:1.0
 * describe:
 */
public class AddRequirementCommand extends Command{
    public void execute() {
        super.requirementGroup.plan();
        super.requirementGroup.add();
        super.pageGroup.plan();
        super.pageGroup.add();
        super.codeGroup.plan();
        super.codeGroup.add();
    }
}
