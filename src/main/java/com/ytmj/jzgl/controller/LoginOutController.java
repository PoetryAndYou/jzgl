package com.ytmj.jzgl.controller;

import com.ytmj.jzgl.utils.JsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 退出
 * @author rui
 * @create 2020-04-07 12:55
 */
@RestController
public class LoginOutController {
    @RequestMapping("/logout")
    public JsonData logout(){
        Subject  subject= SecurityUtils.getSubject();
            if(subject.getPrincipal()!=null){

            }
            subject.logout();
        return JsonData.buildSuccess("logout成功");
    }
}
