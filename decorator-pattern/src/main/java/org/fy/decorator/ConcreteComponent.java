package org.fy.decorator;

/**
 * created by fy on 2018/3/8 15:44.
 * version:1.0
 * describe: 最核心最基本最原始的接口实现类，需要装饰的就是它
 */
public class ConcreteComponent extends Component{
    public void operate() {
        System.out.println("做某些事情");
    }
}
