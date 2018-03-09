package org.fy.strategy.enums;

/**
 * created by fy on 2018/3/9 11:04.
 * version:1.0
 * describe: 策略枚举
 */
public enum Calculator {

    ADD("+"){
        public int exec(int a ,int b){
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a,int b){
            return a-b;
        }
    };

    private String value;

    private Calculator(String value){
        this.value=value;
    }

    public abstract int exec(int a,int b);

}
