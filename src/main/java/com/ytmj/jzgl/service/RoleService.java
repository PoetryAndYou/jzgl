package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-25 19:20
 */
public interface RoleService {
    public List<Role> findAll();

    public void makeRole(Integer userId, Integer roleId) throws Exception;

    public void deleteRoleByUR(Integer userId, Integer roleId) throws Exception;

    public void deleteRoleByUuserId(Integer userId) throws Exception;

    public void addRole(Role role);
    public void deleteRole(Integer id);
}
