package com.miemie.intercept.interceptor.impl;

import com.miemie.intercept.interceptor.ActionInvocation;
import com.miemie.intercept.interceptor.Interceptor;

public class AroundInterceptor implements Interceptor {


    public String intercept(ActionInvocation invocation) {
        // TODO Auto-generated method stub
        before(invocation);
        String result = invocation.invoke();
        after(invocation);
        return result;
    }

    public void before(ActionInvocation invocation) {
        // TODO Auto-generated method stub
        System.out.println("before:" + "AroundInterceptor");
    }

    public void after(ActionInvocation invocation) {
        // TODO Auto-generated method stub
        System.out.println("after:" + "AroundInterceptor");
    }

}
