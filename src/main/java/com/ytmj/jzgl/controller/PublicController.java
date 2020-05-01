package com.ytmj.jzgl.controller;

import com.ytmj.jzgl.domain.Announcement;
import com.ytmj.jzgl.domain.Imgs;
import com.ytmj.jzgl.domain.UserQuery;
import com.ytmj.jzgl.service.AnnouncementService;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公共方法
 * @author rui
 * @create 2020-04-06 22:44
 */
@RestController
@RequestMapping("pub")
public class PublicController {


    @RequestMapping("need_login")
    @ResponseBody
    public JsonData needLogin() {
        return JsonData.buildSuccess("温馨提示：请使用对应的账号登录", -2);
    }

    @RequestMapping("not_permit")
    @ResponseBody
    public JsonData notPermit() {
        return JsonData.buildError("温馨提示：没有权限，拒绝访问", -3);
    }



    /**
     * 登录接口
     *
     * @param userQuery
     * @param request
     * @param response
     * @return
     */
    @PostMapping("login")
    public JsonData login(@RequestBody UserQuery userQuery, HttpServletRequest request, HttpServletResponse response) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userQuery.getUsername(), userQuery.getPassword());
        Map<String, Object> info = new HashMap<>();


        try {
            subject.login(usernamePasswordToken);
            info.put("msg", "登录成功");
            info.put("session_Id", subject.getSession().getId());

            return JsonData.buildSuccess(info);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.buildError("账号密码错误");
        }
    }

    @Autowired
    private AnnouncementService announcementService;
    @RequestMapping("img")
    @ResponseBody
    public JsonData getImg(){
        List<Imgs> allImgs = announcementService.findAllImgs();
        return JsonData.buildSuccess(allImgs);
    }
    @RequestMapping("anno")
    @ResponseBody
    public JsonData getAnno(){
        List<Announcement> allAnno = announcementService.findAllAnno();
        return JsonData.buildSuccess(allAnno);
    }


}
