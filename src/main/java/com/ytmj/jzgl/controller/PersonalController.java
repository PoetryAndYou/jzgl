package com.ytmj.jzgl.controller;

import com.ytmj.jzgl.domain.User;
import com.ytmj.jzgl.service.UserService;
import com.ytmj.jzgl.utils.JsonData;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui
 * @create 2020-04-27 22:19
 */
@RestController
@RequestMapping("personal")
public class PersonalController {
    //查找个人信息
    @Autowired
    private UserService userService;
    @RequestMapping("findSimpleUserInfoByUsername")
    JsonData findSimpleUserInfoByUsername(String username) {
        User simpleUserInfoByUsername = userService.findSimpleUserInfoByUsername(username);
        return JsonData.buildSuccess(simpleUserInfoByUsername);
    }
    //修改个人信息
    @RequestMapping("updateUser")
    public JsonData updateUser(User user) {
        userService.updateUser(user);
        return JsonData.buildSuccess();
    }
    //修改密码
    @RequestMapping("resetPassword")
    public JsonData resetPassword(String password, Integer userId) {
        userService.resetPassword(password, userId);
        return JsonData.buildSuccess();
    }
}
