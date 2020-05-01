package com.ytmj.jzgl.shiro;

import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.Serializable;

/**
 * @author rui
 * @create 2020-04-07 0:24
 */
public class CustomSessionManager extends DefaultWebSessionManager {
    private static final String AUTHORIZATION="token";

    public CustomSessionManager() {
        super();
    }

    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
            String sessionid= WebUtils.toHttp(request).getHeader(AUTHORIZATION);
            if(sessionid!=null){
                request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE);
                request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, sessionid);
                request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
                return sessionid;
            }else{
                return super.getSessionId(request,response);
            }
    }

}
