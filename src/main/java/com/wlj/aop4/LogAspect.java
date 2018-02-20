package com.wlj.aop4;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

//然后编写一个对于时间统计的类作为aspect。
public class LogAspect {

    private Logger logger = Logger.getLogger(LogAspect.class);

    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.warn("Beginning method: " + joinPoint.toLongString());
        long startTime = System.currentTimeMillis();
        Object result;
        System.out.println("==============================");

        try {
            result = joinPoint.proceed();
        } finally {
            logger.warn("Method invocation time: " + (System.currentTimeMillis() - startTime) + " ms.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        return result;
    }

}
