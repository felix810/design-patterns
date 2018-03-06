package org.fy.prototype.shallow;

import java.util.ArrayList;

/**
 * created by fy on 2018/3/6 14:48.
 * version:1.0
 * describe:浅拷贝
 * object提供的clone方法只是提供对象的复制，但是对象内部的数组，引用对象都不拷贝，还是指向原生对象内部的地址
 */
public class Thing implements Cloneable{

    private ArrayList<String> arrayList=new ArrayList<String>();

    public Thing clone(){
        Thing thing=null;
        try {
            thing= (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public ArrayList<String> getArrayList() {
        return this.arrayList;
    }

    public void setArrayList(String value) {
        this.arrayList.add(value);
    }
}
