package com.miemie.intercept.interceptor.impl;

import com.miemie.intercept.interceptor.ActionInvocation;
import com.miemie.intercept.interceptor.Interceptor;

public class ExceptionInterceptor implements Interceptor {

    public void before(ActionInvocation invocation) {
        // TODO Auto-generated method stub
        System.out.println("before:"+"ExceptionInterceptor");
    }


    public String intercept(ActionInvocation invocation) {
        // TODO Auto-generated method stub
        before(invocation);
        String result = invocation.invoke();
        after(invocation);
        return result;
    }


    public void after(ActionInvocation invocation) {
        // TODO Auto-generated method stub
        System.out.println("after:"+"ExceptionInterceptor");
    }

}
