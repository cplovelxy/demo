package com.company.product.template.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RatelimiterHandlerInterceptor implements HandlerInterceptor {
    private final RateLimiter rateLimiter = RateLimiter.create(200);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(rateLimiter.tryAcquire()){
            return true;
        } else {
            System.out.println("没有获取到限流令牌....");
        }

        return false;
    }
}
