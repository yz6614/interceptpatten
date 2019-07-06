package com.miemie.intercept.interceptor;

/**
 * 拦截器接口
 */
public interface  Interceptor {
    void before(ActionInvocation invocation);
    String intercept(ActionInvocation invocation);
    void after(ActionInvocation invocation);
}
