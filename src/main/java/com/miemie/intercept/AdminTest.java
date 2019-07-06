package com.miemie.intercept;

import com.miemie.intercept.interceptor.Action;
import com.miemie.intercept.interceptor.Interceptor;
import com.miemie.intercept.interceptor.impl.AroundInterceptor;
import com.miemie.intercept.interceptor.impl.ExceptionInterceptor;
import com.miemie.intercept.interceptor.impl.I18NInterceptor;
import com.miemie.intercept.invocation.DefaultActionInvoation;

public class AdminTest {
    public static void main(String[] args) {
        Interceptor exptionInterceptor = new ExceptionInterceptor();
        Interceptor i18nInterceptor = new I18NInterceptor();
        Interceptor aroundInterceptor = new AroundInterceptor();

        DefaultActionInvoation actionInvocation = new DefaultActionInvoation();
        actionInvocation.addInterceptor(exptionInterceptor);
        actionInvocation.addInterceptor(i18nInterceptor);
        actionInvocation.addInterceptor(aroundInterceptor);


        Action action = new HelloWorldAction();
        actionInvocation.setAction(action);

        String result = actionInvocation.invoke();
        System.out.println("Action result:" + result);

    }
}
