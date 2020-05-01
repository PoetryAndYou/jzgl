package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.Menu;
import com.ytmj.jzgl.domain.User;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-05 1:38
 */

public interface UserService {

    /**
     * 获取全部信息角色权限
     * @param username
     * @return
     */
    User findAllUserByUsername(String username);

    /**
     * 获取用户基本信息
     * @param userId
     * @return
     */
    User findSimpleUserInfoById(int userId);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    User findSimpleUserInfoByUsername(String username);
    /**
     *
     * 根据用户名查找用户拥有菜单
     */
    List<Menu> findAllByUsername(String username);

    List<User> findAllUsers();

    public void addUser(User user);
    public void resetPassword(String password,Integer  userId);
    public void updateUser(User user);
    public void deleteUserByUserId(Integer userId)throws Exception;

}
