package com.ytmj.jzgl.controller;

import com.ytmj.jzgl.domain.Menu;
import com.ytmj.jzgl.service.UserService;
import com.ytmj.jzgl.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-10 18:53
 */
@RestController
@RequestMapping("home")
public class HomePageController {
    @Autowired
    private UserService userService;

    @GetMapping("findAllMenu")
    @ResponseBody
    public JsonData findAllByUsername(@RequestParam("username") String username) {
        List<Menu> list =userService.findAllByUsername(username);
        return  JsonData.buildSuccess(list);

    }
}
