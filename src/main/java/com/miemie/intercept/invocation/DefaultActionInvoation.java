package com.miemie.intercept.invocation;

import com.miemie.intercept.interceptor.Action;
import com.miemie.intercept.interceptor.ActionInvocation;
import com.miemie.intercept.interceptor.Interceptor;

import java.util.ArrayList;
import java.util.List;

public class DefaultActionInvoation  implements ActionInvocation {
    int index = 0;

    private Action action;

    private List<Interceptor> interceptors = new ArrayList<Interceptor>();



    /**
     * Get action
     * @return Action the action
     */
    public Action getAction() {
        return action;
    }

    /**
     * Set action
     * @param action Action the action to set
     */
    public void setAction(Action action) {
        this.action = action;
    }


    /**
     * Set interceptors
     * @param interceptors List<Interceptor> the interceptors to set
     */
    public void addInterceptor(Interceptor interceptors) {
        this.interceptors.add(interceptors);
    }



    //递归调用
    public String invoke() {
        // TODO Auto-generated method stub
        String result = "";
        if(index == interceptors.size()){
            result = action.execute();
        }else{
            Interceptor interceptor =interceptors.get(index);
            index++;
            result = interceptor.intercept(this);
        }
        return result;
    }

}
