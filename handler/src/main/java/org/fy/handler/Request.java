package org.fy.handler;

import com.sun.org.apache.regexp.internal.RE;

/**
 * created by fy on 2018/3/7 11:18.
 * version:1.0
 * describe:
 */
public class Request {

    private int requestLevel;

    public void setRequestLevel(int requestLevel){
        this.requestLevel=requestLevel;
    }

    public int getRequestLevel(){
        return this.requestLevel;
    }
}
