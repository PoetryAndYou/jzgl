package com.ytmj.jzgl.service.impl;

import com.ytmj.jzgl.domain.Permission;
import com.ytmj.jzgl.mapper.PermissionMapper;
import com.ytmj.jzgl.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-26 22:47
 */
@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public void updatePermission(Permission permission) {
        permissionMapper.updatePermission(permission);
    }

    @Override
    public void insertPermission(Permission permission) {
        permissionMapper.insertPermission(permission);
    }

    @Override
    public void deletePermission(Integer id) {
        permissionMapper.deleteROlePermission(id);
        permissionMapper.deletePermission(id);
    }

    @Override
    public List<Permission> findAllPermission() {
        return permissionMapper.findAllPermission();
    }
}
