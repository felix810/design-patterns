package org.fy.command.group;

/**
 * created by fy on 2018/3/7 10:26.
 * version:1.0
 * describe:
 */
public class RequirementGroup extends Group{
    public void find() {
        System.out.println("找到需求组");
    }

    public void add() {
        System.out.println("增加需求");
    }

    public void delete() {
        System.out.println("删除需求");
    }

    public void change() {
        System.out.println("更改需求");
    }

    public void plan() {
        System.out.println("需求组给出计划");
    }
}
