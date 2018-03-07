package org.fy.command.group;

/**
 * created by fy on 2018/3/7 10:28.
 * version:1.0
 * describe:
 */
public class PageGroup extends Group{
    public void find() {
        System.out.println("找到美工组");
    }

    public void add() {
        System.out.println("增加页面");
    }

    public void delete() {
        System.out.println("删除页面");
    }

    public void change() {
        System.out.println("修改页面");
    }

    public void plan() {
        System.out.println("美工组给出计划");
    }
}
