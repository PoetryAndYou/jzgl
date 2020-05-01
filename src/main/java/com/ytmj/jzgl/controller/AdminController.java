package com.ytmj.jzgl.controller;

import com.ytmj.jzgl.domain.*;
import com.ytmj.jzgl.service.*;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理员界面
 *
 * @author rui
 * @create 2020-04-07 11:18
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AnnouncementService announcementService;

    //查询所有照片
    @RequestMapping("img")
    @ResponseBody
    public JsonData getImg() {
        List<Imgs> allImgs = announcementService.findAllImgs();
        return JsonData.buildSuccess(allImgs);
    }

    //添加图片
    @RequestMapping("addImgs")
    public JsonData addImgs(Imgs imgs) {
        announcementService.addImgs(imgs);
        return JsonData.buildSuccess("");
    }

    @RequestMapping("deleteImgs")
    //删除图片
    public JsonData deleteImgs(Integer id) {
        announcementService.deleteImgs(id);
        return JsonData.buildSuccess("");
    }

    @RequestMapping("updataAnnouncement")
    //修改日志
    public JsonData updataAnnouncement(Announcement announcement) {
        announcementService.updataAnnouncement(announcement);
        return JsonData.buildSuccess("");
    }

    //添加日志
    @RequestMapping("addAnno")
    public JsonData addAnno(Announcement announcement) {
        announcementService.addAnno(announcement);
        return JsonData.buildSuccess("");
    }

    //删除日志
    @RequestMapping("deleteAnno")
    public JsonData deleteAnno(Integer id) {
        announcementService.deleteAnno(id);
        return JsonData.buildSuccess("");
    }

    @RequestMapping("anno")
    @ResponseBody
    public JsonData getAnno() {
        List<Announcement> allAnno = announcementService.findAllAnno();
        return JsonData.buildSuccess(allAnno);
    }

    @Autowired
    private UserService userService;

    //查询所有用户及其权限
    @RequestMapping("findAllUsers")
    public JsonData findAllUsers() {
        List<User> allUsers = userService.findAllUsers();
        return JsonData.buildSuccess(allUsers);
    }

    @RequestMapping("addUser")
    public JsonData addUser(User user) {
        userService.addUser(user);
        return JsonData.buildSuccess();
    }

    @RequestMapping("resetPassword")
    public JsonData resetPassword(String password, Integer userId) {
        userService.resetPassword(password, userId);
        return JsonData.buildSuccess();
    }

    @RequestMapping("updateUser")
    public JsonData updateUser(User user) {
        userService.updateUser(user);
        return JsonData.buildSuccess();
    }

    @Autowired
    private RoleService roleService;

    @RequestMapping("findAll")
    public JsonData findAll() {
        List<Role> all = roleService.findAll();
        return JsonData.buildSuccess(all);
    }

    @RequestMapping("makeRole")
    public JsonData makeRole(Integer userId, Integer roleId) throws Exception {
        roleService.makeRole(userId, roleId);
        return JsonData.buildSuccess();
    }

    @RequestMapping("deleteRoleByUR")
    public JsonData deleteRoleByUR(Integer userId, Integer roleId) throws Exception {
        roleService.deleteRoleByUR(userId, roleId);
        return JsonData.buildSuccess();
    }

    //删除用户
    @RequestMapping("deleteUserByUserId")
    public void deleteUserByUserId(Integer userId) throws Exception {
        userService.deleteUserByUserId(userId);
    }

    //添加角色
    @RequestMapping("addRole")
    public JsonData addRole(Role role) {
        roleService.addRole(role);
        return JsonData.buildSuccess();
    }

    @RequestMapping("deleteRole")
    public JsonData deleteRole(Integer id) {
        roleService.deleteRole(id);
        return JsonData.buildSuccess();

    }

    @Autowired
    private PermissionService permissionService;

    //更新权限
    @RequestMapping("updatePermission")
    public JsonData updatePermission(Permission permission) {
        permissionService.updatePermission(permission);
        return JsonData.buildSuccess();
    }

    //插入权限
    @RequestMapping("insertPermission")
    public JsonData insertPermission(Permission permission) {
        permissionService.insertPermission(permission);
        return JsonData.buildSuccess();
    }

    //删除权限
    @RequestMapping("deletePermission")
    public JsonData deletePermission(Integer id) {
        permissionService.deletePermission(id);
        return JsonData.buildSuccess();
    }

    @RequestMapping("findAllPermission")
    public JsonData findAllPermission() {
        List<Permission> allPermission = permissionService.findAllPermission();
        return JsonData.buildSuccess(allPermission);
    }

    @Autowired
    private PatientService patientService;

    @RequestMapping("findAllDeparment")
    public JsonData findAllDepartment() {
        List<Viewdepartment> allViewdepartment = patientService.findAllViewdepartment();
        return JsonData.buildSuccess(allViewdepartment);
    }

    @Autowired
    private DepartmentService departmentService;

    //删除
    @RequestMapping("deleteDepartment")
    public JsonData deleteDepartment(Integer id) {
        departmentService.deleteDepartment(id);
        return JsonData.buildSuccess();
    }

    //添加
    @RequestMapping("addDepartment")
    public JsonData addDepartment(Viewdepartment viewdepartment) {
        departmentService.addDepartment(viewdepartment);
        return JsonData.buildSuccess();
    }

    //更新
    @RequestMapping("updateDepartment")
    public JsonData updateDepartment(Viewdepartment viewdepartment) {
        departmentService.updateDepartment(viewdepartment);
        return JsonData.buildSuccess();
    }
}
