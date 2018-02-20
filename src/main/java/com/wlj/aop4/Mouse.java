package com.wlj.aop4;

// 由于项目主管提出统计每个方法执行的具体时间，打印到日志以后方便分析问题。
// 这个也是很常用的办法，但是我们调用的外部模块非常多，每个地方都加上一个时间统计就显得非常难看了。
// 所以这个事情当然还是交给spring的AOP功能代理掉，就算那天不想统计时间了，清除这个功能也异常容易。
// 下面给出一个小例子，非常的简单。
// 首先，给出一个Mouse的对象，他有几个基本的动作，我们就统计这些动作的具体执行时间。

public class Mouse {

    public String click() {
        System.out.println("click");
        return "clicked me";
    }

    public void move() {
        System.out.println("move");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
