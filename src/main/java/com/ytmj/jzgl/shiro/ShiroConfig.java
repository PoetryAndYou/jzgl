package com.ytmj.jzgl.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author rui
 * @create 2020-04-06 23:40
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        System.out.println("执行了ShiroFilterFactoryBean");

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //必须设置SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //需要登录的接口，如果访问某个需要的登录的接口，未登录会转到/pub/need_login
        shiroFilterFactoryBean.setLoginUrl("/pub/need_login");

        //登录，但没有权限 先验证登录->在验证是否有权限
        shiroFilterFactoryBean.setUnauthorizedUrl("/pub/not_permit");
        //设置自定义filter 拥有任一一个角色都可以例如t("/admin/**","roleOrFilter[admin，root]");包含一个就可以
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        filterMap.put("roleOrFilter",new CustomRolesOrAuthorizationFilter());

        shiroFilterFactoryBean.setFilters(filterMap);

        //拦截器路径，坑一：部分路径时有时无，原因使用hashmap(无须)
        Map<String,String> filterChainDefinitionMap=new LinkedHashMap<String,String>();
        //DefaultFilter
        //退出
        filterChainDefinitionMap.put("/logout","anon");
        //匿名访问
        filterChainDefinitionMap.put("/pub/**","anon");
        //放行druid
        filterChainDefinitionMap.put("/druid/**","anon");
        //roleOrFilter[admin,Registeredstaff]
        //挂号员
        filterChainDefinitionMap.put("/registered/**","roleOrFilter[admin,Registeredstaff]");
        //采购员
        filterChainDefinitionMap.put("/drug/**","roleOrFilter[admin,buyer]");
        //医生
        filterChainDefinitionMap.put("/viewdoctor/**","roleOrFilter[admin,doctor]");
        //放行swagger
        filterChainDefinitionMap.put("/swagger**/**","anon");
        filterChainDefinitionMap.put("/webjars**/**","anon");
        filterChainDefinitionMap.put("/v2**/**","anon");
        //某个角色
        filterChainDefinitionMap.put("/admin/**","roles[admin]");

        //有挂号权限的才可以访问
//        filterChainDefinitionMap.put("/registered/update","perms[registered_update]");
        //坑二：顺序执行没从上到下
        //拦截全部
        filterChainDefinitionMap.put("/**","authc");



        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

       //前后端分离
        securityManager.setSessionManager(sessionManager());
        //设置realm推荐放到最后
        securityManager.setRealm(customRealm());
        return securityManager;
    }

    @Bean
    public CustomRealm customRealm(){

        CustomRealm customRealm=new CustomRealm();

        customRealm.setCredentialsMatcher(hashedCredentialsMatcher());

        return customRealm;
    }

    /**
     * 自定义解密规则
     * @return
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        //设置散列算法
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        //散列次数 2次相当于MD5（MD5（XXX）
        hashedCredentialsMatcher.setHashIterations(2);
        return hashedCredentialsMatcher;
    }

    @Bean
    public SessionManager sessionManager(){

        CustomSessionManager sessionManager = new CustomSessionManager();
        //过期时间
        sessionManager.setGlobalSessionTimeout(20000000);
        return sessionManager;
    }

}
