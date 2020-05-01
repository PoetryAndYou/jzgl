package com.ytmj.jzgl.service.impl;

import com.ytmj.jzgl.domain.Role;
import com.ytmj.jzgl.mapper.RoleMapper;
import com.ytmj.jzgl.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-25 19:20
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public void makeRole(Integer userId, Integer roleId) throws Exception {
        roleMapper.makeRole(userId,roleId);
    }

    @Override
    public void deleteRoleByUR(Integer userId, Integer roleId) throws Exception {
        roleMapper.deleteRoleByUR(userId,roleId);
    }

    @Override
    public void deleteRoleByUuserId(Integer userId) throws Exception {
        roleMapper.deleteRoleByUuserId(userId);
    }

    @Override
    public void addRole(Role role) {
        roleMapper.addRole(role);
    }

    @Override
    public void deleteRole(Integer id) {
        roleMapper.deleteRole(id);
    }
}
