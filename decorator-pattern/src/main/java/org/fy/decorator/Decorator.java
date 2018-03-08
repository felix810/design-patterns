package org.fy.decorator;

/**
 * created by fy on 2018/3/8 15:52.
 * version:1.0
 * describe: 动态的给某个对象添加一些额外的职责。就装饰而言，装饰模式比子类更加灵活
 *
 * 这个就是装饰的角色。实现接口或者抽象类的方法，不一定有抽象方法，但是一定有一个private可以指向component
 */
public abstract class Decorator extends Component{

    private Component component;

    public Decorator(Component component){
        this.component=component;
    }

    @Override
    public void operate(){
        this.component.operate();
    }
}
