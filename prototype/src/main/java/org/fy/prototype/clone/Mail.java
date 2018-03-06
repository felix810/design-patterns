package org.fy.prototype.clone;


import lombok.Data;
/**
 * created by fy on 2018/3/6 14:04.
 * version:1.0
 * describe:不通过关键字new来创建一个对象，而是通过复制的方式，叫做原型模式
 */
@Data
public class Mail implements Cloneable{

    private String receiver;

    private String sender;

    private String content;

    private String subect;

    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.content=advTemplate.getContent();
        this.subect=advTemplate.getAdvSubject();
    }

    public Mail clone(){
        Mail mail=null;
        try {
            mail=(Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
