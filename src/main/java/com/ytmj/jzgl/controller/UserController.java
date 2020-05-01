package com.ytmj.jzgl.controller;

import com.ytmj.jzgl.domain.User;
import com.ytmj.jzgl.service.UserService;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 根据用户名查找用户
 * @author rui
 * @create 2020-04-12 23:54
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findUserByUsername")
    @ResponseBody
    public JsonData findSimpleUserInfoByUsername() {
        Subject subject= SecurityUtils.getSubject();
        String username =(String) subject.getPrincipal();
        User allUserByUsername = userService.findSimpleUserInfoByUsername(username);
        return JsonData.buildSuccess(allUserByUsername);

    }

}
