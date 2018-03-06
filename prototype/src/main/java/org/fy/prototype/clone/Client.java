package org.fy.prototype.clone;

import java.util.Random;

/**
 * created by fy on 2018/3/6 14:16.
 * version:1.0
 * describe:
 */
public class Client {

    public static void main(String args[]){
        Mail mail=new Mail(new AdvTemplate());
        mail.setTail("解释权归张三所有");

        for(int i=1;i<6;i++){
            mail.setSender(getRandString(2)+"@"+getRandString(2)+".com");
            mail.setReceiver(getRandString(3)+"@"+getRandString(4)+".com");
            mail.setContent("");

            Mail mail1=mail.clone();
            mail1.setSubect(getRandString(3));
            seendMail(mail1);
        }
    }

    public static void seendMail(Mail mail){
        System.out.println(mail.getSender()+"给"+mail.getReceiver()+"发送了一封邮件,标题是"+mail.getSubect()+",结尾是"+mail.getTail());
    }

    public static String getRandString(int max){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer=new StringBuffer();
        Random random=new Random();
        for(int i=0;i<max;i++){
            stringBuffer.append(str.charAt(random.nextInt(str.length())));
        }
        return stringBuffer.toString();
    }

}
