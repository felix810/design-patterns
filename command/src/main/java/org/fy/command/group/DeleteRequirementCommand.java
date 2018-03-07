package org.fy.command.group;

/**
 * created by fy on 2018/3/7 10:34.
 * version:1.0
 * describe:
 */
public class DeleteRequirementCommand extends Command{
    public void execute() {
        super.requirementGroup.plan();
        super.requirementGroup.delete();
    }
}
