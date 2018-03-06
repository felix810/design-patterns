package org.fy.prototype.deep;

import java.util.ArrayList;

/**
 * created by fy on 2018/3/6 14:48.
 * version:1.0
 * describe:深拷贝
 * 完全的复制一个对象。拷贝模式无法和final关键字共用
 */
public class Thing implements Cloneable{

    private ArrayList<String> arrayList=new ArrayList<String>();

    public Thing clone(){
        Thing thing=null;
        try {
            thing= (Thing) super.clone();
            //深度拷贝
            thing.arrayList= (ArrayList<String>) this.arrayList.clone();
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
