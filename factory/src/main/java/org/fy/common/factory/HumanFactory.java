package org.fy.common.factory;

/**
 * created by fy on 2018/2/7 17:53.
 * version:1.0
 * describe:
 */
public class HumanFactory extends AbstractHumanFactory{
    public <T extends Human> T createHuman(Class<T> c)  {
        Human human=null;
        if(human==null){
            try {
                human=(T)Class.forName(c.getName()).newInstance();
            } catch (Exception e) {
                System.out.println("生成失败"+e.getMessage());
            }
        }
        return (T) human;
    }
}
