package com.wlj.aop5;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogAdvice {

    private static Logger loggerAdvice = Logger.getLogger(LogAdvice.class);

    public Object around(ProceedingJoinPoint pip) throws Throwable {
        //获取组件类名
        String className = pip.getTarget().getClass().getName();
        //获取调用方法名
        String method = pip.getSignature().getName();
        //取得数据库连接前时间
        long begin = System.currentTimeMillis();
        //当前系统时间
        String date = new SimpleDateFormat("yyyy-MM-dd:mm:ss").format(new Date());
        Object obj = pip.proceed();

        //取得数据库连接后时间
        long end = System.currentTimeMillis();
        //数据库响应时间
        int sqlTime = (int) (end - begin);
        String msg = date + "，执行了" + className + "." + method + "()";

        loggerAdvice.warn(msg + "\t数据库响应时间： " + sqlTime);
        return obj;

    }
}