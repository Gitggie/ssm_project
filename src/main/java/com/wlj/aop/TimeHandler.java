package com.wlj.aop;

//横切关注点，打印时间
public class TimeHandler {

    public void printTime() {

        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }

}
