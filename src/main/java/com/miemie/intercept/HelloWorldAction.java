package com.miemie.intercept;

import com.miemie.intercept.interceptor.Action;

public class HelloWorldAction implements Action {

    public String execute() {
        System.out.println(" Hellow World !!!");
        return "Finish  !!!";
    }
}
