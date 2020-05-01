package com.ytmj.jzgl.service.impl;

import com.ytmj.jzgl.domain.Menu;
import com.ytmj.jzgl.domain.Role;
import com.ytmj.jzgl.domain.User;
import com.ytmj.jzgl.mapper.RoleMapper;
import com.ytmj.jzgl.mapper.UserMapper;
import com.ytmj.jzgl.service.UserService;
import com.ytmj.jzgl.utils.Md5Utiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author rui
 * @create 2020-04-05 1:38
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findAllUserByUsername(String username) {
        System.err.println(username);
        User user=userMapper.findByUsername(username);
        List<Role> roleList= roleMapper.findByUserId(user.getId());
        user.setRoleList(roleList);
        return user;
    }

    @Override
    public User findSimpleUserInfoById(int userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public User findSimpleUserInfoByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public List<Menu> findAllByUsername(String username) {
        return userMapper.findAllByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public void addUser(User user) {
        user.setCreateTime(new Date());
        user.setPassword(Md5Utiles.testMD5("123"));
        userMapper.addUser(user);
    }

    @Override
    public void resetPassword(String password, Integer userId) {
        userMapper.resetPassword(Md5Utiles.testMD5(password),userId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUserByUserId(Integer userId) throws Exception {
        roleMapper.deleteRoleByUuserId(userId);
        userMapper.deleteUserByUserId(userId);
    }
}
