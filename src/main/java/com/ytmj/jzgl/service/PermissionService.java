package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.Permission;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-26 22:46
 */
public interface PermissionService {
    //更新权限
    public void updatePermission(Permission permission);
    //插入权限
    public void insertPermission(Permission permission);
    //删除权限
    public void deletePermission(Integer id);


    public List<Permission> findAllPermission();
}
