/*
package com.company.product.template.config;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DbReadWriteAop {
    public static final String slave = "slave";
    public static final String select = "select";


    @Before(value = "execution(* com.company.product.template.mapper.*.*(..))")
    public void before(JoinPoint joinPoint){
        Signature signature =  joinPoint.getSignature();
        String methodName = signature.getName();
        if(methodName.startsWith(select)){
            DynamicDataSourceContextHolder.push(slave);
        }
    }

}
*/
