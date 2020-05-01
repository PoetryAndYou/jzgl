package com.ytmj.jzgl.shiro;

import com.ytmj.jzgl.domain.Permission;
import com.ytmj.jzgl.domain.Role;
import com.ytmj.jzgl.domain.User;
import com.ytmj.jzgl.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rui
 * @create 2020-04-06 23:12
 */
public class CustomRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    /**
     * 授权
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("授权");

        String username = (String) principals.getPrimaryPrincipal();

        User user = userService.findAllUserByUsername(username);

        List<String> stringRoleList = new ArrayList<>();

        List<String> stringPermissionList = new ArrayList<>();

        List<Role> roleList = user.getRoleList();
        for (Role role : roleList) {
            stringRoleList.add(role.getRoleName());
            List<Permission> permissionList = role.getPermissionList();
            for (Permission p : permissionList) {
                if(p!=null) {
                    stringPermissionList.add(p.getName());
                }
            }
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(stringRoleList);
        simpleAuthorizationInfo.addStringPermissions(stringPermissionList);

        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("认证");
        //获取用户信息 token代表用户输入的
        String username = (String) token.getPrincipal();

        User user = userService.findAllUserByUsername(username);

        //获取密码
        String pwd = user.getPassword();
        if (pwd == null || "".equals(pwd)) {
            return null;
        }

        return new SimpleAuthenticationInfo(username, user.getPassword(), this.getClass().getName());
    }
}
