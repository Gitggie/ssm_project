package com.wlj.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        BraveKnight br = (BraveKnight) ac.getBean("knight");
        br.saying();

    }
}
