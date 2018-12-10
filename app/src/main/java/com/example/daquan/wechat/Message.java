package com.example.daquan.wechat;

/**
 * Created by daquan on 2018/9/19.
 */

public class Message {
    private int type;
    private String mess;

    public Message(int type,String mess){
        this.type = type;
        this.mess = mess;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
